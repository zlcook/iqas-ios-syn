package com.zlcook.iqas.ios.exception;

import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.vo.BaseStatusVO;

/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午9:39:08
* springmvn中全局异常处理器
*/
@ControllerAdvice
@ResponseBody
@SuppressWarnings("rawtypes")
public class GlobalExceptionHandler {
	 private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	/**
	   * 400 - Bad Request
	   */
	  //@ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(MissingServletRequestParameterException.class)
	  public BaseStatusVO handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
	    logger.error("缺少请求参数", e);
	    return new BaseStatusVO<>(ResponseStateEnum.BAD_REQUEST);
	  }

	  /**
	   * 400 - Bad Request
	   */
	 // @ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(HttpMessageNotReadableException.class)
	  public BaseStatusVO handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
	    logger.error("参数解析失败", e);
	    return new BaseStatusVO<>(ResponseStateEnum.BAD_REQUEST);
	  }

	  /**
	   * 400 - Bad Request
	   */
	 // @ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(MethodArgumentNotValidException.class)
	  public BaseStatusVO handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
	    logger.error("参数验证失败", e);
	   /* BindingResult result = e.getBindingResult();
	    FieldError error = result.getFieldError();
	    String field = error.getField();
	    String code = error.getDefaultMessage();
	    String message = String.format("%s:%s", field, code);*/
	    return new BaseStatusVO<>(ResponseStateEnum.BAD_REQUEST);
	  }

	  /**
	   * 400 - Bad Request
	   */
	// @ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(BindException.class)
	  public BaseStatusVO handleBindException(BindException e) {
	    logger.error("参数绑定失败", e);
	   /* BindingResult result = e.getBindingResult();
	    FieldError error = result.getFieldError();
	    String field = error.getField();
	    String code = error.getDefaultMessage();
	    String message = String.format("%s:%s", field, code);*/
	    return new BaseStatusVO<>(ResponseStateEnum.BAD_REQUEST);
	  }

	  /**
	   * 400 - Bad Request
	   */
	 // @ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(ConstraintViolationException.class)
	  public BaseStatusVO handleServiceException(ConstraintViolationException e) {
	    logger.error("参数验证失败", e);
	    /*Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
	    ConstraintViolation<?> violation = violations.iterator().next();
	    String message = violation.getMessage();*/
	    return new BaseStatusVO<>(ResponseStateEnum.BAD_REQUEST);
	  }

	  /**
	   * 400 - Bad Request
	   */
	 // @ResponseStatus(HttpStatus.BAD_REQUEST)
	  @ExceptionHandler(ValidationException.class)
	  public BaseStatusVO handleValidationException(ValidationException e) {
	    logger.error("参数验证失败", e);
	    return new BaseStatusVO<>(ResponseStateEnum.BAD_REQUEST);
	  }
	  
	  /**
	   * 404 - Not Found
	   */
	 // @ResponseStatus(HttpStatus.NOT_FOUND)
	  @ExceptionHandler(NoHandlerFoundException.class)
	  public BaseStatusVO handleNoHandlerFoundException(NoHandlerFoundException e) {
	    logger.error("方法不存在", e);
	    return new BaseStatusVO<>(ResponseStateEnum.NOT_FOUND);
	  }

	  /**
	   * 404 - Not Found
	   */
	 // @ResponseStatus(HttpStatus.NOT_FOUND)
	  @ExceptionHandler(NoSuchRequestHandlingMethodException.class)
	  public BaseStatusVO handleNoSuchRequestHandlingMethodException(NoSuchRequestHandlingMethodException e) {
	    logger.error("方法不存在", e);
	    return new BaseStatusVO<>(ResponseStateEnum.NOT_FOUND);
	  }
	  
	  
	  /**
	   * 405 - Method Not Allowed
	   */
	 // @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	  @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	  public BaseStatusVO handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
	    logger.error("不支持当前请求方法", e);
	    return new BaseStatusVO<>(ResponseStateEnum.METHOD_NOT_ALLOWED);
	  }

	  /**
	   * 415 - Unsupported Media Type
	   */
	 // @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
	  @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
	  public BaseStatusVO handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
	    logger.error("不支持当前媒体类型", e);
	    return new BaseStatusVO<>(ResponseStateEnum.UNSUPPORTED_MEDIA_TYPE);
	  }
	  /**
	   * 406 - Unsupported Media Type
	   */
	//  @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
	  @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	  public BaseStatusVO handleHttpMediaTypeNotAcceptableException(HttpMediaTypeNotAcceptableException e) {
	    logger.error("不接收当前媒体类型", e);
	    return new BaseStatusVO<>(ResponseStateEnum.NOT_ACCEPTABLE);
	  }

	  /**
	   * 500 - Internal Server Error
	   */
	 // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	  @ExceptionHandler(ServiceException.class)
	  public BaseStatusVO handleServiceException(ServiceException e) {
	    logger.error("业务逻辑异常", e);
	    return new BaseStatusVO<>(ResponseStateEnum.INTERNAL_SERVER_ERROR);
	  }

	  /**
	   * 500 - Internal Server Error
	   */
	 // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	  @ExceptionHandler(Exception.class)
	  public BaseStatusVO handleException(Exception e) {
	    logger.error("未知异常", e);
	    return  new BaseStatusVO<>(ResponseStateEnum.UNKNOWN_SERVER_ERROR);
	  }

	  /**
	   * 操作数据库出现异常:名称重复，外键关联
	   */
	 // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	  @ExceptionHandler(DataIntegrityViolationException.class)
	  public BaseStatusVO handleException(DataIntegrityViolationException e) {
	    logger.error("操作数据库出现异常:", e);
	    return   new BaseStatusVO<>(ResponseStateEnum.DATAINTEGRITY_VIOLATION_EXCEPTION);
	  }
}
