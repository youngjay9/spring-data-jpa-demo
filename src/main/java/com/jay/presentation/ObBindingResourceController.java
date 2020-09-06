package com.jay.presentation;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin // 前端頁面跨網域請求,須加此 annotation
@RestController
@RequestMapping(value = "/bindingCard")
public class ObBindingResourceController {

  private final Logger logger = LoggerFactory.getLogger(ObBindingResourceController.class);

  @RequestMapping(value = "/test", method = RequestMethod.POST)
  public String test(MultipartFile file, HttpServletRequest req) {

    try {
      String content = new String(file.getBytes(), StandardCharsets.UTF_8);
      logger.info("content:{}", content);
    } catch (IOException e) {
      e.printStackTrace();
      return "False";
    }

    logger.info("Receive!!");
    return "Success";
  }


  @RequestMapping(value = "/addingCheckInfo", method = RequestMethod.POST)
  public String addingCheckInfo(MultipartFile file, HttpServletRequest req) {
    try {
      String content = new String(file.getBytes(), StandardCharsets.UTF_8);
      logger.info("content:{}", content);

      ObjectMapper mapper = new ObjectMapper();
      Map<String, Object> map = mapper.readValue(content, Map.class);
      String channelId = (String) map.get("channelId");

      List<String> idNoList = (List<String>) map.get("idNoList");

      logger.info("channelId:{}, idNos:{}", channelId, idNoList);

    } catch (IOException e) {
      e.printStackTrace();
      return "False";
    }

    logger.info("Receive!!");
    return "Success";
  }

  @RequestMapping(value = "/updatingCheckInfo", method = RequestMethod.POST)
  public String updatingCheckInfo(MultipartFile file, HttpServletRequest req) {
    try {
      String content = new String(file.getBytes(), StandardCharsets.UTF_8);
      logger.info("content:{}", content);
    } catch (IOException e) {
      e.printStackTrace();
      return "False";
    }

    logger.info("Receive!!");
    return "Success";
  }


}
