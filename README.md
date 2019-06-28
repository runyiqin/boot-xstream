# boot-xstream
使用xstream实现Java对象和xml的互相转换，附带util和测试


xstream常用注解:
	@XStreamAlias 别名注解 针对类和字段
	@XStreamAsAttribute 转换成属性 针对字段
	@XStreamOmitField 忽略字段 针对字段
	@XStreamConverter 注入转换器 作用于对象
	@XStreamImplicit 隐式集合 作用于集合