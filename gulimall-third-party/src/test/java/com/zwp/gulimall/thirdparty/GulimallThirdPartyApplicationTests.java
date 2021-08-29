package com.zwp.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

	@Resource
	OSSClient ossClient;

	@Test
	public void testOssUpload() throws FileNotFoundException {
		// 填写本地文件的完整路径。如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
		InputStream inputStream = new FileInputStream("D:\\文档\\java项目\\Guli Mall\\分布式基础\\谷粒商城-微服务架构图.jpg");
       // 依次填写Bucket名称（例如examplebucket）和Object完整路径（例如exampledir/exampleobject.txt）。Object完整路径中不能包含Bucket名称。
		ossClient.putObject("gulimall-zwp-dev", "dis2.jpg", inputStream);

        // 关闭OSSClient。
		ossClient.shutdown();

		System.out.println("上传成功....");
	}
}
