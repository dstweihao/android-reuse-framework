package com.zws.android.bean.auth;

import java.util.List;

public class LoginBean {

    /**
     * result : true
     * message : OK
     * data : {"username":"zlg001","mobile":"18664632886","role":0,"register_time":1565138981,"last_login_time":1570601084,"password_changed_time":1565138981,"register_ip":"121.33.243.34","last_login_ip":"218.19.99.66","dev_extra":{"data_expire":1,"data_capacity":2048,"data_size":20.4296875,"update_time":1570600802,"devtype_capacity":10,"dev_capacity":20},"status":"normal","language":"zh","nickname":"TestMan","avatar":"https://zlgcloud.oss-cn-shenzhen.aliyuncs.com/zlab/z/zlg001/images/avatar.png?time=1569835646177","desc":"我是JEST前端测试路过的！8","sysname":"物联网云平台","city":"asd","detailaddress":"China","company":"Choormn","gender":1,"email":"aaa900712@163.com","userid":"5d4a20259e8e18f62b9efd9b","uri":"/v1/users/zlg001","device_types":[{"devtype":"zlg001_devtype_invert","basetype":"invert","schema":{"memo":{"desc":{"comment":"一代机三相机","maxLength":1024,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"test":{"nickname":"test","comment":"tes","unit":"","min":0,"max":0,"type":"number","format":"int"},"total_energy":{"comment":"总发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"总电量"},"today_energy":{"comment":"当天发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"今日发电量"},"temperature":{"comment":"逆变器温度","format":"float","type":"number","unit":"℃","min":0,"max":150,"nickname":"温度"},"gfci":{"comment":"对地漏电流","format":"float","type":"number","unit":"mA","min":0,"max":150},"bus_volt":{"comment":"BUS电压","format":"float","type":"number","unit":"V","min":0,"max":150,"nickname":"电压"},"power":{"comment":"逆变器输出有功功率","format":"float","type":"number","unit":"W","min":0,"max":6000,"nickname":"功率"},"q_power":{"comment":"逆变器输出无功功率","format":"float","type":"number","unit":"W","min":0,"max":1000},"pf":{"comment":"逆变器输出功率因数","format":"float","type":"number","unit":"","min":0,"max":1},"pv1_volt":{"comment":"直流输入电压pv1","format":"float","type":"number","unit":"V","min":0,"max":300},"pv1_curr":{"comment":"直流输入电流pv1","format":"float","type":"number","unit":"A","min":0,"max":20},"pv2_volt":{"comment":"直流输入电压pv2","format":"float","type":"number","unit":"V","min":0,"max":300},"pv2_curr":{"comment":"直流输入电流pv2","format":"float","type":"number","unit":"A","min":0,"max":20},"pv3_volt":{"comment":"直流输入电压pv3","format":"float","type":"number","unit":"V","min":0,"max":300},"pv3_curr":{"comment":"直流输入电流pv3","format":"float","type":"number","unit":"A","min":0,"max":20},"l1_volt":{"comment":"交流输出L1相电压","format":"float","type":"number","unit":"V","min":0,"max":300},"l1_curr":{"comment":"交流输出L1相电流","format":"float","type":"number","unit":"A","min":0,"max":220},"l1_freq":{"comment":"交流输出L1相频率","format":"float","type":"number","unit":"Hz","min":0,"max":400},"l1_dci":{"comment":"交流输出L1相直流分量","format":"float","type":"number","unit":"mA","min":0,"max":1000},"l1_power":{"comment":"交流输出L1相功率","format":"float","type":"number","unit":"W","min":0,"max":10000},"l1_pf":{"comment":"交流输出L1相功率因数","format":"float","type":"number","unit":"","min":0,"max":1}},"status":{"sw_ver1":{"comment":"software version1","min":0,"format":"float","type":"number"},"sw_ver2":{"comment":"software version2","min":0,"format":"float","type":"number"},"safety_spec":{"comment":"安规","min":0,"format":"float","type":"number"},"total_runtime":{"comment":"总运行时间","unit":"H","min":0,"format":"float","type":"number"},"today_runtime":{"comment":"当天运行时间","unit":"H","min":0,"format":"float","type":"number"},"clientip":{"comment":"client ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","type":"object","properties":{"version":{"comment":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","type":"string"},"version":{"comment":"新固件版本","type":"string"},"url":{"comment":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","type":"number","format":"int"}},"commands":{"set":{"comment":"set prop","cmdtype":true,"args":{"name":{"format":"name","type":"string"},"value":{"type":"string"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","cmdtype":true,"args":{"time":{"required":true,"type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"loginfo":{"comment":"日志信息","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":19.19140625,"devices_size":0.10546875,"event_size":0.08203125,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"f4204f80-ceed-11e9-a199-6f1bb8d247fd","owner":"zlg001","created_time":1567585700,"devtypeid":"5d6f75a4d2de0bf92dec0084","devices":{"count":3},"uri":"/v1/devices/devtype/zlg001_devtype_invert"},{"devtype":"zggw","basetype":"zggw","enable_secret":false,"schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":1,"max":1,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2)，LoraWan网关(3);此处必须为3，即LoraWan网关"},"desc":{"comment":"通用网关","maxLength":1024,"type":"string"},"node_gw_bydata":{"comment":"网关字段","type":"boolean","default":true},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{},"status":{"mac":{"comment":"网关的mac地址","type":"string","properties":{}},"time":{"comment":"网关当前的时间","unit":"ms","min":0,"type":"number","format":"float","minLength":0,"properties":{}},"rxnb":{"comment":"网关接受的包数量","min":0,"type":"number","format":"float","minLength":0,"properties":{}},"txnb":{"comment":"网关发送的包数量","min":0,"type":"number","format":"float","minLength":0,"properties":{}},"NodeCnt":{"comment":"网关挂载的节点数量","min":0,"type":"number","format":"float","minLength":0,"properties":{}},"maxNodeCnt":{"comment":"网关可挂载的最大节点数量","min":0,"max":5000,"type":"number","format":"float","maxLength":5000,"minLength":0,"properties":{}},"clientip":{"comment":"client ip","type":"string","maxLength":32,"properties":{}},"currentfm":{"comment":"设备当前固件的信息","type":"object","properties":{"version":{"comment":"当前固件版本","type":"string","required":true,"properties":""}}},"newfm":{"comment":"待升级固件的信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","required":true,"enums":[0,1],"properties":""},"devtype":{"comment":"设备型号","type":"string","properties":""},"version":{"comment":"新固件版本","type":"string","properties":""},"url":{"comment":"新固件地址","type":"string","properties":""}}},"gps":{"type":"object","comment":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度","properties":""},"longitude":{"type":"number","format":"float","comment":"纬度","properties":""},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int","properties":""}}},"fault":{"comment":"fault","type":"number","format":"int","properties":{}}},"commands":{"set_config":{"comment":"配置设备参数，与具体的设备有关","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","cmdtype":true,"args":{"time":{"required":true,"type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据"}}}},"warnings":{},"errors":{},"logs":{"loginfo":{"comment":"日志信息","args":{"info":{"comment":"日志信息","type":"string"},"level":{"comment":"日志等级","type":"number"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":true,"online_type":0,"verifyid":"","data_size":0.01171875,"devices_size":0.06640625,"event_size":0.01171875,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":1,"dtype_secret":"","owner":"zlg001","created_time":1567647223,"comment":"asdasdasdasdasdasddsasdasd","devtypeid":"5d7065f7d2de0bf872f23562","devices":{"count":1},"uri":"/v1/devices/devtype/zggw"},{"devtype":"invert","basetype":"invert","enable_secret":false,"schema":{"memo":{"desc":{"comment":"一代机三相机","maxLength":1024,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"total_energy":{"comment":"总发电量","nickname":"总发电量","unit":"kWh","min":0,"format":"float","type":"number"},"today_energy":{"comment":"当天发电量","nickname":"当天发电量","unit":"kWh","min":0,"format":"float","type":"number"},"temperature":{"comment":"逆变器温度","nickname":"逆变器温度","format":"float","type":"number","unit":"℃","min":0,"max":150},"gfci":{"comment":"对地漏电流","nickname":"对地漏电流","format":"float","type":"number","unit":"mA","min":0,"max":150},"bus_volt":{"comment":"BUS电压","nickname":"BUS电压","format":"float","type":"number","unit":"V","min":0,"max":150},"power":{"comment":"输出有功功率","nickname":"输出有功功率","format":"float","type":"number","unit":"W","min":0,"max":6000},"q_power":{"comment":"逆变器输出无功功率","nickname":"输出无功功率","format":"float","type":"number","unit":"W","min":0,"max":1000},"pf":{"comment":"逆变器输出功率因数","nickname":"输出功率因数","format":"float","type":"number","unit":"","min":0,"max":1},"pv1_volt":{"comment":"直流输入电压pv1","nickname":"直流输入电压pv1","format":"float","type":"number","unit":"V","min":0,"max":300},"pv1_curr":{"comment":"直流输入电流pv1","nickname":"直流输入电流pv1","format":"float","type":"number","unit":"A","min":0,"max":20},"pv2_volt":{"comment":"直流输入电压pv2","nickname":"直流输入电压pv2","format":"float","type":"number","unit":"V","min":0,"max":300},"pv2_curr":{"comment":"直流输入电流pv2","nickname":"直流输入电流pv2","format":"float","type":"number","unit":"A","min":0,"max":20},"pv3_volt":{"comment":"直流输入电压pv3","nickname":"直流输入电压pv3","format":"float","type":"number","unit":"V","min":0,"max":300},"pv3_curr":{"comment":"直流输入电流pv3","nickname":"直流输入电流pv3","format":"float","type":"number","unit":"A","min":0,"max":20},"l1_volt":{"comment":"交流输出L1相电压","nickname":"交流输出L1相电压","format":"float","type":"number","unit":"V","min":0,"max":300},"l1_curr":{"comment":"交流输出L1相电流","nickname":"交流输出L1相电流","format":"float","type":"number","unit":"A","min":0,"max":220},"l1_freq":{"comment":"交流输出L1相频率","nickname":"交流输出L1相频率","format":"float","type":"number","unit":"Hz","min":0,"max":400},"l1_dci":{"comment":"交流输出L1相直流分量","nickname":"交流输出L1相直流分量","format":"float","type":"number","unit":"mA","min":0,"max":1000},"l1_power":{"comment":"交流输出L1相功率","nickname":"交流输出L1相功率","format":"float","type":"number","unit":"W","min":0,"max":10000},"l1_pf":{"comment":"交流输出L1相功率因数","nickname":"交流输出L1相功率因数","format":"float","type":"number","unit":"","min":0,"max":1}},"status":{"sw_ver1":{"comment":"software version1","nickname":"软件版本1","min":0,"format":"float","type":"number"},"sw_ver2":{"comment":"software version2","nickname":"软件版本2","min":0,"format":"float","type":"number"},"safety_spec":{"comment":"安规","nickname":"安规","min":0,"format":"float","type":"number"},"total_runtime":{"comment":"总运行时间","nickname":"总运行时间","unit":"H","min":0,"format":"float","type":"number"},"today_runtime":{"comment":"当天运行时间","nickname":"当天运行时间","unit":"H","min":0,"format":"float","type":"number"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","nickname":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"set":{"comment":"set prop","nickname":"属性设置","cmdtype":true,"args":{"name":{"format":"name","nickname":"属性名","type":"string"},"value":{"nickname":"属性值","type":"string"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","format":"int","type":"number"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0,"devices_size":0.0703125,"event_size":0,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"dtype_secret":"","owner":"zlg001","created_time":1568777278,"comment":"ssss","devtypeid":"5d81a43eb137e81cc595615e","devices":{"count":0},"uri":"/v1/devices/devtype/invert"},{"devtype":"ClassB_","basetype":"LoRaWAN_CLASSB_OTAA","comment":"","lora_deviceprofile_id":"2d2fac91-00ad-4417-b5f3-064e629a66bf","schema":{"memo":{"devid":{"type":"string","readonly":true,"required":true,"minLength":16,"maxLength":16,"comment":"lorawan设备id，8字节16进制字符串"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型"},"devclass":{"type":"number","enums":[0,1,2,3],"min":2,"max":2,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"mqttadapter":{"type":"number","enums":[0,1],"required":true,"comment":"loraserver mqtt转换为何种zlgcloud mqtt：转为STR_TOPIC_REPORT_RAW(0)，转为STR_TOPIC_REPORT_DATA(1);请根据需要设置min=max=0，或min=max=1"},"appKey":{"type":"string","minLength":32,"maxLength":32,"comment":"OTAA使用的appKey,16字节16进制字符串"},"nwkKey":{"type":"string","minLength":32,"maxLength":32,"required":true,"comment":"OTAA使用的nwkKey,16字节16进制字符串"},"appEUI":{"type":"string","minLength":16,"maxLength":16,"required":true,"comment":"OTAA使用的appEUI,8字节16进制字符串"},"skipFCntCheck":{"type":"boolean","comment":"默认为true"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{"deviceProfile":{"classBTimeout":2,"classCTimeout":0,"factoryPresetFreqs":[0],"id":"","macVersion":"1.0.1","maxDutyCycle":0,"maxEIRP":0,"name":"zlg001_ClassB_","networkServerID":"","organizationID":"","pingSlotDR":5,"pingSlotFreq":0,"pingSlotPeriod":256,"regParamsRevision":"A","rfRegion":"CN_470_510","rxDROffset1":0,"rxDataRate2":0,"rxDelay1":1,"rxFreq2":505300000,"supports32BitFCnt":true,"supportsClassB":true,"supportsClassC":false,"supportsJoin":true}},"data":{"raw":{"comment":"数据","nickname":"数据","type":"string"},"loraserver":{"comment":"数据属性","nickname":"数据属性","type":"string"}},"status":{"appKey":{"comment":"应用秘钥","nickname":"应用秘钥","minLength":32,"maxLength":32,"readonly":true,"type":"string"},"appEUI":{"comment":"应用appEUI","nickname":"应用appEUI","minLength":16,"maxLength":16,"readonly":true,"type":"string"},"power":{"comment":"电量","nickname":"电量","min":0,"format":"float","type":"number"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","nickname":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"set":{"comment":"set prop","nickname":"设置属性","cmdtype":true,"args":{"name":{"format":"name","type":"string","nickname":"设置属性名"},"value":{"type":"string","nickname":"设置属性值"}}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["hex","ascii","base64"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"},"fPort":{"required":true,"type":"number","max":223,"min":1,"comment":"端口号","nickname":"端口号"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}}},"warnings":{"power_low":{"comment":"电量低","args":{"value":{"format":"float","type":"number"}}}},"errors":{"power_too_low":{"comment":"电量过低","args":{"value":{"format":"float","type":"number"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","type":"number","format":"int"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.046875,"devices_size":0.10546875,"event_size":0.046875,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":2,"enable_secret":false,"dtype_secret":"77909b40-d9e3-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568790659,"devtypeid":"5d81d883b137e8f1909709d2","devices":{"count":4},"uri":"/v1/devices/devtype/ClassB_"},{"devtype":"sasdasdA","basetype":"candtu-200","comment":"s2222","schema":{"memo":{"desc":{"comment":"两路CAN-bus数据记录仪","maxLength":1024,"type":"string"},"devname":{"comment":"设备名称","maxLength":31,"minLength":1,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"time":{"nickname":"时间","format":"float","type":"number"},"id":{"nickname":"CAN帧ID","format":"float","type":"number"},"flag":{"nickname":"报文标志","format":"float","type":"number"},"ch":{"nickname":"通道","format":"float","type":"number"},"len":{"nickname":"数据长度","format":"float","type":"number"},"data":{"nickname":"数据内容","type":"object"}},"status":{"devname":{"comment":"设备名, ASCII字符, 最长31个字符","nickname":"设备名","type":"string","minimum":1,"maximum":31},"model":{"comment":"设备型号","nickname":"设备型号","type":"string","enums":["CANDTU-200UWG","CANDTU-200UWGR","CANDTU-200UWGR-B"]},"gps":{"type":"object","comment":"gps定位。","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度。","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度。","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int","nickname":"GPS信息时间戳"}}},"CfgInfo":{"comment":"CANDTU配置","type":"object","nickname":"CANDTU配置","properties":{"CAN":{"type":"object","comment":"CAN配置","nickname":"CAN配置","properties":{"CAN0":{"type":"object","comment":"CAN0配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}},"CAN1":{"type":"object","comment":"CAN1配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}}}},"LIN":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"LIN0":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Baud":{"type":"integer","comment":"LIN波特率","minimum":1000,"maximum":20000},"DataLen":{"type":"integer","comment":"LIN数据长度","minimum":1,"maximum":8}}}}},"DI":{"type":"object","comment":"DI配置","nickname":"DI配置","properties":{"DI0":{"type":"object","comment":"DI配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"DI功能","enum":[0,1]},"Interval":{"type":"integer","comment":"DI记录间隔(ms)，DI功能为输入时有效","enum":[1,2,5,10,20,50,100,200,500,1000]}}}}},"DO":{"type":"object","comment":"DO配置","nickname":"DO配置","properties":{"DO0":{"type":"object","comment":"DO配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"告警条件，1：记录满，2：总线错误，3：存储状态异常，4：GPS区域告警","enum":[1,2,4,8]},"Output":{"type":"integer","comment":"DO告警时输出值","enum":[0,1]},"InOut":{"type":"integer","comment":"DO告警GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"DO告警GPS纬度"},"Long":{"type":"integer","comment":"DO告警GPS经度"},"Radius":{"type":"integer","comment":"DO告警GPS中心点半径","minimum":50,"maximum":10000}}}}},"RecCfg":{"type":"object","comment":"CANDTU记录配置","nickname":"CANDTU记录配置","properties":{"RecFullHdl":{"type":"integer","comment":"存储空间满处理(0:循环记录/1：停止记录)","enum":[0,1]},"RecFSize":{"type":"integer","comment":"最大记录文件大小(MB)","minimum":2,"maximum":512},"RecErr":{"type":"integer","comment":"是否记录CAN错误帧(0:不记录/1：记录)","enum":[0,1]},"RecMer":{"type":"integer","comment":"通道记录数据是否合并(0：不合并/1:合并)","enum":[0,1]}}},"TrgMode":{"type":"object","comment":"CANDTU记录触发模式配置","nickname":"CANDTU记录触发模式配置","properties":{"RecMode":{"type":"integer","comment":"CAN记录模式(0：长时间记录/1:条件记录/2：预触发记录/3：定时记录/4：不记录)","enum":[0,1,2,3,4]},"ConRec":{"type":"object","comment":"条件记录配置对象","properties":{"StartChn":{"type":"integer","comment":"开始记录通道号","enum":[0,1]},"StartExt":{"type":"integer","comment":"开始记录帧类型（0：标准帧/1:扩展帧）","enum":[0,1]},"StartOp":{"type":"integer","comment":"开始记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StartIdS":{"type":"integer","comment":"开始记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StartIdL":{"type":"integer","comment":"开始记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopChn":{"type":"integer","comment":"停止记录通道号,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopExt":{"type":"integer","comment":"停止记录帧类型（0：标准帧/1:扩展帧),标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopOp":{"type":"integer","comment":"停止记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StopIdS":{"type":"integer","comment":"停止记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopIdL":{"type":"integer","comment":"停止记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}},"PreTrgRec":{"type":"object","comment":"预触发记录配置对象","properties":{"PreVal":{"type":"integer","comment":"预触发记录帧数","minimum":10,"maximum":100000},"PostVal":{"type":"integer","comment":"触发后记录时间(ms)","minimum":10,"maximum":86400000},"TrgNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":512},"TrgCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"TimRec":{"type":"object","comment":"定时记录配置对象","properties":{"Period":{"type":"object","comment":"定时时间周期（ms）","minimum":10,"maximum":86400000},"TmNDA":{"type":"object","comment":"定时时间内无数据记录方式（0：不记录/1：保存最近一次数据/2：保存自定义数据）","enum":[0,1,2]},"TmNDAUD":{"type":"string","comment":"定时时间内无记录保存的自定义数据（16进制保存为字符串）","minimum":0,"maximum":16},"FltNum":{"type":"integer","comment":"过滤条件数","minimum":0,"maximum":256},"FltCon":{"type":"array","comment":"过滤条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}}}},"Quota":{"type":"object","comment":"存储空间分配","nickname":"存储空间分配","properties":{"CAN0":{"type":"integer","comment":"CAN0占用空间百分比","minimum":0,"maximum":100},"CAN1":{"type":"integer","comment":"CAN1占用空间百分比","minimum":0,"maximum":100},"LIN0":{"type":"integer","comment":"LIN占用空间百分比","minimum":0,"maximum":100},"DI0":{"type":"integer","comment":"DI0占用空间百分比","minimum":0,"maximum":100},"DI1":{"type":"integer","comment":"DI1占用空间百分比","minimum":0,"maximum":100},"GPS":{"type":"integer","comment":"GPS占用空间百分比","minimum":0,"maximum":100}}},"GPSRec":{"type":"object","comment":"GPS记录配置","nickname":"GPS记录配置","properties":{"Enable":{"type":"integer","comment":"GPS记录使能（1：使能/0：失能）","enum":[0,1]},"Type":{"type":"integer","comment":"定位系统类型（0：自动选择/1：北斗/2：GPS）","enum":[0,1,2]},"Period":{"type":"integer","comment":"记录周期（s）","minimum":1,"maximum":1800}}},"SMS":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"SMS0":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS1":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS2":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS3":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS4":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS5":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}}}},"Net":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"Net0":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net1":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net2":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}}}},"NetFlt":{"type":"object","comment":"无线过滤配置","nickname":"无线过滤配置","properties":{"Enable":{"type":"integer","comment":"无线传输加密使能(1:使能/0：失能)","enum":[0,1]},"FltNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":256},"FltCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":256,"items":{"type":"object","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"过滤记录类型（0：ID滤波/1：时间段滤波）","enum":[0,1]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"NetGen":{"type":"object","comment":"无线通用配置","nickname":"无线通用配置","properties":{"Times":{"type":"integer","comment":"断网续传次数","enum":[0,1,2,3,4,5]},"Proto":{"type":"integer","comment":"加密协议编号","enum":[0,1]},"SendIdEn":{"type":"integer","comment":"网络数据携带设备ID和绝对时间戳使能","enum":[0,1]},"NetLogEn":{"type":"integer","comment":"网络调试日志使能","enum":[0,1]}}},"IotEn":{"type":"object","comment":"实时数据上传使能","nickname":"实时数据上传使能","properties":{"CAN0":{"type":"integer","comment":"CAN0数据上传使能(1:使能/0：失能)","enum":[0,1]},"CAN1":{"type":"integer","comment":"CAN1数据上传使能(1:使能/0：失能)","enum":[0,1]},"GPS":{"type":"integer","comment":"GPS数据上传使能(1:使能/0：失能)","enum":[0,1]},"LIN0":{"type":"integer","comment":"LIN数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI0":{"type":"integer","comment":"DI0数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI1":{"type":"integer","comment":"DI1数据上传使能(1:使能/0：失能)","enum":[0,1]}}}}},"SDStat":{"comment":"SD卡状态,0-SD卡未插入，1-SD卡插入，2-设备记录中，-1-设备无SD卡","nickname":"SD卡状态","type":"number","format":"int","enum":[0,1,2,-1]},"FwVer":{"comment":"固件版本号, 如：V1.00","nickname":"固件版本号","type":"string"},"HwVer":{"comment":"硬件版本号, 如：V1.00","nickname":"硬件版本号","type":"string"},"Serial":{"comment":"产品序列号, 8字符","nickname":"产品序列号","type":"string"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"StartRec":{"comment":"启动记录","nickname":"启动记录","cmdtype":true,"show_frontend":true},"StopRec":{"comment":"停止记录","nickname":"停止记录","cmdtype":true,"show_frontend":true},"ClrDev":{"comment":"清空设备","nickname":"清空设备","cmdtype":true,"show_frontend":true},"GetRecFileInfo":{"comment":"获取文件列表信息","nickname":"获取文件列表","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"StartTime":{"comment":"起始时间戳","nickname":"起始时间戳","type":"number","format":"int"},"StopTime":{"comment":"结束时间戳","nickname":"结束时间戳","type":"number","format":"int"}}},"GetRecFile":{"comment":"获取记录文件","nickname":"获取记录文件","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"Name":{"comment":"文件名","nickname":"文件名","type":"string"},"Offset":{"comment":"文件偏移","nickname":"文件偏移","type":"number","format":"int"},"Tag":{"comment":"本次传输文件标签","nickname":"文件标签","type":"number","format":"int"}}},"CancelGetRec":{"comment":"取消传输","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型","nickname":"数据类型","type":"number","format":"int"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"RecFull":{"comment":"记录满","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}}},"errors":{"err":{"comment":"CAN总线错误","args":{"chn":{"comment":"CAN错误通道","type":"number","format":"int"},"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"err_code":{"comment":"错误码","type":"number","format":"int"}}},"storge_err":{"comment":"存储状态异常","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}},"gps_err":{"comment":"GPS不在指定GPS区域","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"type":{"comment":"告警类型：1：短信通知设置的告警，2：DO输出设置的告警","type":"number","format":"int"},"longitude":{"comment":"经度","type":"number","format":"float"},"latitude":{"comment":"纬度","type":"number","format":"float"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","format":"int","type":"number"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1,"num":-1},"options":{"unique":true}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0,"devices_size":0.01171875,"event_size":0,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"108bce80-d9fa-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568800365,"devtypeid":"5d81fe6db137e83b3a97fd28","devices":{"count":0},"uri":"/v1/devices/devtype/sasdasdA"},{"devtype":"zlg001linkwan","basetype":"demo","comment":"LinkWan手持网络分析仪","schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"pictureId":{"comment":"图片id","format":"name","type":"string"},"pointName":{"comment":"名称","format":"name","type":"string"},"pointType":{"comment":"点类型","format":"name","type":"string"},"pointId":{"comment":"点id","format":"name","type":"string"},"position":{"comment":"坐标","format":"json","type":"object"},"testResult":{"comment":"test结果","format":"json","type":"object"},"testSetting":{"comment":"test设置","format":"json","type":"object"},"testLevel":{"comment":"test等级","format":"name","type":"number"}},"status":{"devname":{"type":"string","comment":"设备名"},"deviceType":{"type":"string","comment":"设备类型"},"deveui":{"type":"string","comment":"设备唯一识别码"},"appeui":{"type":"string","comment":"应用唯一识别码"},"appkey":{"type":"string","comment":"应用密钥"},"addr":{"type":"string","comment":"ABP模式下的设备地址"},"appskey":{"type":"string","comment":"ABP模式下的应用密钥"},"nwkskey":{"type":"string","comment":"ABP模式下的网络密钥"},"mode":{"type":"string","comment":"入网方式"},"class":{"type":"string","comment":"设备类型"},"bandmask":{"type":"string","comment":"使用频段"},"freqtype":{"type":"number","comment":"频段模式"},"power":{"type":"number","comment":"发送功率"},"dr":{"type":"number","comment":"发送速率"},"sendByte":{"type":"number","comment":"发送字节数"},"antennaGain":{"type":"number","comment":"天线增益"}},"commands":{"set_report_interval":{"comment":"设置上报温度时间间隔","cmdtype":true,"args":{"value":{"type":"number","format":"int","comment":"单位为秒。"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"temperature_normal":{"comment":"工作温度正常","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0,"devices_size":0.01171875,"event_size":0,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"e895e7a0-da83-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568859568,"devtypeid":"5d82e5b0b137e80a369e08d4","devices":{"count":0},"uri":"/v1/devices/devtype/zlg001linkwan"},{"devtype":"zlg001lorawan","basetype":"demo","comment":"LoRaWan手持网络分析仪","schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"pictureId":{"comment":"图片id","format":"name","type":"string"},"pointName":{"comment":"名称","format":"name","type":"string"},"pointType":{"comment":"点类型","format":"name","type":"string"},"pointId":{"comment":"点id","format":"name","type":"string"},"position":{"comment":"坐标","format":"json","type":"object"},"testResult":{"comment":"test结果","format":"json","type":"object"},"testSetting":{"comment":"test设置","format":"json","type":"object"},"testLevel":{"comment":"test等级","format":"name","type":"number"}},"status":{"devname":{"type":"string","comment":"设备名"},"deviceType":{"type":"string","comment":"设备类型"},"deveui":{"type":"string","comment":"设备唯一识别码"},"appeui":{"type":"string","comment":"应用唯一识别码"},"appkey":{"type":"string","comment":"应用密钥"},"addr":{"type":"string","comment":"ABP模式下的设备地址"},"appskey":{"type":"string","comment":"ABP模式下的应用密钥"},"nwkskey":{"type":"string","comment":"ABP模式下的网络密钥"},"mode":{"type":"string","comment":"入网方式"},"class":{"type":"string","comment":"设备类型"},"band":{"type":"string","comment":"使用频段"},"LRCHMASK":{"type":"string","comment":"上行频点"},"power":{"type":"number","comment":"发送功率"},"dr":{"type":"number","comment":"发送速率"},"sendByte":{"type":"number","comment":"发送字节数"},"antennaGain":{"type":"number","comment":"天线增益"}},"commands":{"set_report_interval":{"comment":"设置上报温度时间间隔","cmdtype":true,"args":{"value":{"type":"number","format":"int","comment":"单位为秒。"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"temperature_normal":{"comment":"工作温度正常","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.01171875,"devices_size":0.08203125,"event_size":0.01171875,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"e896f910-da83-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568859568,"devtypeid":"5d82e5b0b137e85aeb9e08d5","devices":{"count":1},"uri":"/v1/devices/devtype/zlg001lorawan"},{"devtype":"zlg001zigbee","basetype":"demo","comment":"ZigBee手持网络分析仪","schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"pictureId":{"comment":"图片id","format":"name","type":"string"},"pointName":{"comment":"名称","format":"name","type":"string"},"pointType":{"comment":"点类型","format":"name","type":"string"},"pointId":{"comment":"点id","format":"name","type":"string"},"position":{"comment":"坐标","format":"json","type":"object"},"testResult":{"comment":"test结果","format":"json","type":"object"},"testSetting":{"comment":"test设置","format":"json","type":"object"},"testLevel":{"comment":"test等级","format":"name","type":"number"}},"status":{"devname":{"type":"string","comment":"设备名"},"deviceType":{"type":"string","comment":"设备类型"},"chan":{"type":"string","comment":"设备通道号"},"panId":{"type":"string","comment":"设备网络号"},"moduleKey":{"type":"string","comment":"设备密钥"},"myAddr":{"type":"string","comment":"本地网络地址"},"dstAddr":{"type":"string","comment":"目标网络地址"},"powerLevel":{"type":"string","comment":"发送功率"},"antennaGain":{"type":"string","comment":"天线增益"},"addr_type":{"type":"number","comment":"目标地址类型"},"dstIEEE":{"type":"string","comment":"目标MAC地址"},"devType":{"type":"string","comment":"zigbee设备类型"}},"commands":{"set_report_interval":{"comment":"设置上报温度时间间隔","cmdtype":true,"args":{"value":{"type":"number","format":"int","comment":"单位为秒。"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"temperature_normal":{"comment":"工作温度正常","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.03515625,"devices_size":0.10546875,"event_size":0.03515625,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"e8987fb0-da83-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568859568,"devtypeid":"5d82e5b0b137e827dc9e08d6","devices":{"count":3},"uri":"/v1/devices/devtype/zlg001zigbee"},{"devtype":"demo","basetype":"demo","enable_secret":false,"schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"temp":{"comment":"温度","format":"float","type":"number"}},"status":{"sw_version":{"comment":"software version","format":"float","type":"number"},"settings":{"comment":"settings","type":"object","properties":{"firstName":{"type":"string"},"lastName":{"type":"string"},"age":{"description":"Age in years","type":"integer","minimum":0}},"required":["firstName","lastName"]},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","nickname":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"set_report_interval":{"comment":"设置上报温度时间间隔","cmdtype":true,"args":{"value":{"type":"number","format":"int","comment":"单位为秒。"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"temperature_normal":{"comment":"工作温度正常","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.08203125,"devices_size":0.10546875,"event_size":0.08203125,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"dtype_secret":"","owner":"zlg001","created_time":1568860339,"devtypeid":"5d82e8b3b137e81bcb9e1fb3","devices":{"count":7},"uri":"/v1/devices/devtype/demo"},{"devtype":"CANDTU200","basetype":"candtu-200","comment":"sssss","schema":{"memo":{"desc":{"comment":"两路CAN-bus数据记录仪","maxLength":1024,"type":"string"},"devname":{"comment":"设备名称","maxLength":31,"minLength":1,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"time":{"nickname":"时间","format":"float","type":"number"},"id":{"nickname":"CAN帧ID","format":"float","type":"number"},"flag":{"nickname":"报文标志","format":"float","type":"number"},"ch":{"nickname":"通道","format":"float","type":"number"},"len":{"nickname":"数据长度","format":"float","type":"number"},"data":{"nickname":"数据内容","type":"object"}},"status":{"devname":{"comment":"设备名, ASCII字符, 最长31个字符","nickname":"设备名","type":"string","minimum":1,"maximum":31},"model":{"comment":"设备型号","nickname":"设备型号","type":"string","enums":["CANDTU-200UWG","CANDTU-200UWGR","CANDTU-200UWGR-B"]},"gps":{"type":"object","comment":"gps定位。","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度。","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度。","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int","nickname":"GPS信息时间戳"}}},"CfgInfo":{"comment":"CANDTU配置","type":"object","nickname":"CANDTU配置","properties":{"CAN":{"type":"object","comment":"CAN配置","nickname":"CAN配置","properties":{"CAN0":{"type":"object","comment":"CAN0配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}},"CAN1":{"type":"object","comment":"CAN1配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}}}},"LIN":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"LIN0":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Baud":{"type":"integer","comment":"LIN波特率","minimum":1000,"maximum":20000},"DataLen":{"type":"integer","comment":"LIN数据长度","minimum":1,"maximum":8}}}}},"DI":{"type":"object","comment":"DI配置","nickname":"DI配置","properties":{"DI0":{"type":"object","comment":"DI配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"DI功能","enum":[0,1]},"Interval":{"type":"integer","comment":"DI记录间隔(ms)，DI功能为输入时有效","enum":[1,2,5,10,20,50,100,200,500,1000]}}}}},"DO":{"type":"object","comment":"DO配置","nickname":"DO配置","properties":{"DO0":{"type":"object","comment":"DO配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"告警条件，1：记录满，2：总线错误，3：存储状态异常，4：GPS区域告警","enum":[1,2,4,8]},"Output":{"type":"integer","comment":"DO告警时输出值","enum":[0,1]},"InOut":{"type":"integer","comment":"DO告警GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"DO告警GPS纬度"},"Long":{"type":"integer","comment":"DO告警GPS经度"},"Radius":{"type":"integer","comment":"DO告警GPS中心点半径","minimum":50,"maximum":10000}}}}},"RecCfg":{"type":"object","comment":"CANDTU记录配置","nickname":"CANDTU记录配置","properties":{"RecFullHdl":{"type":"integer","comment":"存储空间满处理(0:循环记录/1：停止记录)","enum":[0,1]},"RecFSize":{"type":"integer","comment":"最大记录文件大小(MB)","minimum":2,"maximum":512},"RecErr":{"type":"integer","comment":"是否记录CAN错误帧(0:不记录/1：记录)","enum":[0,1]},"RecMer":{"type":"integer","comment":"通道记录数据是否合并(0：不合并/1:合并)","enum":[0,1]}}},"TrgMode":{"type":"object","comment":"CANDTU记录触发模式配置","nickname":"CANDTU记录触发模式配置","properties":{"RecMode":{"type":"integer","comment":"CAN记录模式(0：长时间记录/1:条件记录/2：预触发记录/3：定时记录/4：不记录)","enum":[0,1,2,3,4]},"ConRec":{"type":"object","comment":"条件记录配置对象","properties":{"StartChn":{"type":"integer","comment":"开始记录通道号","enum":[0,1]},"StartExt":{"type":"integer","comment":"开始记录帧类型（0：标准帧/1:扩展帧）","enum":[0,1]},"StartOp":{"type":"integer","comment":"开始记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StartIdS":{"type":"integer","comment":"开始记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StartIdL":{"type":"integer","comment":"开始记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopChn":{"type":"integer","comment":"停止记录通道号,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopExt":{"type":"integer","comment":"停止记录帧类型（0：标准帧/1:扩展帧),标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopOp":{"type":"integer","comment":"停止记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StopIdS":{"type":"integer","comment":"停止记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopIdL":{"type":"integer","comment":"停止记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}},"PreTrgRec":{"type":"object","comment":"预触发记录配置对象","properties":{"PreVal":{"type":"integer","comment":"预触发记录帧数","minimum":10,"maximum":100000},"PostVal":{"type":"integer","comment":"触发后记录时间(ms)","minimum":10,"maximum":86400000},"TrgNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":512},"TrgCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"TimRec":{"type":"object","comment":"定时记录配置对象","properties":{"Period":{"type":"object","comment":"定时时间周期（ms）","minimum":10,"maximum":86400000},"TmNDA":{"type":"object","comment":"定时时间内无数据记录方式（0：不记录/1：保存最近一次数据/2：保存自定义数据）","enum":[0,1,2]},"TmNDAUD":{"type":"string","comment":"定时时间内无记录保存的自定义数据（16进制保存为字符串）","minimum":0,"maximum":16},"FltNum":{"type":"integer","comment":"过滤条件数","minimum":0,"maximum":256},"FltCon":{"type":"array","comment":"过滤条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}}}},"Quota":{"type":"object","comment":"存储空间分配","nickname":"存储空间分配","properties":{"CAN0":{"type":"integer","comment":"CAN0占用空间百分比","minimum":0,"maximum":100},"CAN1":{"type":"integer","comment":"CAN1占用空间百分比","minimum":0,"maximum":100},"LIN0":{"type":"integer","comment":"LIN占用空间百分比","minimum":0,"maximum":100},"DI0":{"type":"integer","comment":"DI0占用空间百分比","minimum":0,"maximum":100},"DI1":{"type":"integer","comment":"DI1占用空间百分比","minimum":0,"maximum":100},"GPS":{"type":"integer","comment":"GPS占用空间百分比","minimum":0,"maximum":100}}},"GPSRec":{"type":"object","comment":"GPS记录配置","nickname":"GPS记录配置","properties":{"Enable":{"type":"integer","comment":"GPS记录使能（1：使能/0：失能）","enum":[0,1]},"Type":{"type":"integer","comment":"定位系统类型（0：自动选择/1：北斗/2：GPS）","enum":[0,1,2]},"Period":{"type":"integer","comment":"记录周期（s）","minimum":1,"maximum":1800}}},"SMS":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"SMS0":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS1":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS2":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS3":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS4":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS5":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}}}},"Net":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"Net0":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net1":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net2":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}}}},"NetFlt":{"type":"object","comment":"无线过滤配置","nickname":"无线过滤配置","properties":{"Enable":{"type":"integer","comment":"无线传输加密使能(1:使能/0：失能)","enum":[0,1]},"FltNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":256},"FltCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":256,"items":{"type":"object","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"过滤记录类型（0：ID滤波/1：时间段滤波）","enum":[0,1]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"NetGen":{"type":"object","comment":"无线通用配置","nickname":"无线通用配置","properties":{"Times":{"type":"integer","comment":"断网续传次数","enum":[0,1,2,3,4,5]},"Proto":{"type":"integer","comment":"加密协议编号","enum":[0,1]},"SendIdEn":{"type":"integer","comment":"网络数据携带设备ID和绝对时间戳使能","enum":[0,1]},"NetLogEn":{"type":"integer","comment":"网络调试日志使能","enum":[0,1]}}},"IotEn":{"type":"object","comment":"实时数据上传使能","nickname":"实时数据上传使能","properties":{"CAN0":{"type":"integer","comment":"CAN0数据上传使能(1:使能/0：失能)","enum":[0,1]},"CAN1":{"type":"integer","comment":"CAN1数据上传使能(1:使能/0：失能)","enum":[0,1]},"GPS":{"type":"integer","comment":"GPS数据上传使能(1:使能/0：失能)","enum":[0,1]},"LIN0":{"type":"integer","comment":"LIN数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI0":{"type":"integer","comment":"DI0数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI1":{"type":"integer","comment":"DI1数据上传使能(1:使能/0：失能)","enum":[0,1]}}}}},"SDStat":{"comment":"SD卡状态,0-SD卡未插入，1-SD卡插入，2-设备记录中，-1-设备无SD卡","nickname":"SD卡状态","type":"number","format":"int","enum":[0,1,2,-1]},"FwVer":{"comment":"固件版本号, 如：V1.00","nickname":"固件版本号","type":"string"},"HwVer":{"comment":"硬件版本号, 如：V1.00","nickname":"硬件版本号","type":"string"},"Serial":{"comment":"产品序列号, 8字符","nickname":"产品序列号","type":"string"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"StartRec":{"comment":"启动记录","nickname":"启动记录","cmdtype":true,"show_frontend":true},"StopRec":{"comment":"停止记录","nickname":"停止记录","cmdtype":true,"show_frontend":true},"ClrDev":{"comment":"清空设备","nickname":"清空设备","cmdtype":true,"show_frontend":true},"GetRecFileInfo":{"comment":"获取文件列表信息","nickname":"获取文件列表","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"StartTime":{"comment":"起始时间戳","nickname":"起始时间戳","type":"number","format":"int"},"StopTime":{"comment":"结束时间戳","nickname":"结束时间戳","type":"number","format":"int"}}},"GetRecFile":{"comment":"获取记录文件","nickname":"获取记录文件","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"Name":{"comment":"文件名","nickname":"文件名","type":"string"},"Offset":{"comment":"文件偏移","nickname":"文件偏移","type":"number","format":"int"},"Tag":{"comment":"本次传输文件标签","nickname":"文件标签","type":"number","format":"int"}}},"CancelGetRec":{"comment":"取消传输","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型","nickname":"数据类型","type":"number","format":"int"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"RecFull":{"comment":"记录满","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}}},"errors":{"err":{"comment":"CAN总线错误","args":{"chn":{"comment":"CAN错误通道","type":"number","format":"int"},"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"err_code":{"comment":"错误码","type":"number","format":"int"}}},"storge_err":{"comment":"存储状态异常","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}},"gps_err":{"comment":"GPS不在指定GPS区域","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"type":{"comment":"告警类型：1：短信通知设置的告警，2：DO输出设置的告警","type":"number","format":"int"},"longitude":{"comment":"经度","type":"number","format":"float"},"latitude":{"comment":"纬度","type":"number","format":"float"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","format":"int","type":"number"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1,"num":-1},"options":{"unique":true}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0,"devices_size":0.01171875,"event_size":0,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"891f0000-daa5-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568874011,"devtypeid":"5d831e1bb137e885bb9fb619","devices":{"count":0},"uri":"/v1/devices/devtype/CANDTU200"},{"devtype":"candtu-200","basetype":"candtu-200","enable_secret":false,"schema":{"memo":{"desc":{"comment":"两路CAN-bus数据记录仪","maxLength":1024,"type":"string"},"devname":{"comment":"设备名称","maxLength":31,"minLength":1,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"time":{"nickname":"时间","format":"float","type":"number"},"id":{"nickname":"CAN帧ID","format":"float","type":"number"},"flag":{"nickname":"报文标志","format":"float","type":"number"},"ch":{"nickname":"通道","format":"float","type":"number"},"len":{"nickname":"数据长度","format":"float","type":"number"},"data":{"nickname":"数据内容","type":"object"}},"status":{"devname":{"comment":"设备名, ASCII字符, 最长31个字符","nickname":"设备名","type":"string","minimum":1,"maximum":31},"model":{"comment":"设备型号","nickname":"设备型号","type":"string","enums":["CANDTU-200UWG","CANDTU-200UWGR","CANDTU-200UWGR-B"]},"gps":{"type":"object","comment":"gps定位。","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度。","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度。","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int","nickname":"GPS信息时间戳"}}},"CfgInfo":{"comment":"CANDTU配置","type":"object","nickname":"CANDTU配置","properties":{"CAN":{"type":"object","comment":"CAN配置","nickname":"CAN配置","properties":{"CAN0":{"type":"object","comment":"CAN0配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}},"CAN1":{"type":"object","comment":"CAN1配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}}}},"LIN":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"LIN0":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Baud":{"type":"integer","comment":"LIN波特率","minimum":1000,"maximum":20000},"DataLen":{"type":"integer","comment":"LIN数据长度","minimum":1,"maximum":8}}}}},"DI":{"type":"object","comment":"DI配置","nickname":"DI配置","properties":{"DI0":{"type":"object","comment":"DI配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"DI功能","enum":[0,1]},"Interval":{"type":"integer","comment":"DI记录间隔(ms)，DI功能为输入时有效","enum":[1,2,5,10,20,50,100,200,500,1000]}}}}},"DO":{"type":"object","comment":"DO配置","nickname":"DO配置","properties":{"DO0":{"type":"object","comment":"DO配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"告警条件，1：记录满，2：总线错误，3：存储状态异常，4：GPS区域告警","enum":[1,2,4,8]},"Output":{"type":"integer","comment":"DO告警时输出值","enum":[0,1]},"InOut":{"type":"integer","comment":"DO告警GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"DO告警GPS纬度"},"Long":{"type":"integer","comment":"DO告警GPS经度"},"Radius":{"type":"integer","comment":"DO告警GPS中心点半径","minimum":50,"maximum":10000}}}}},"RecCfg":{"type":"object","comment":"CANDTU记录配置","nickname":"CANDTU记录配置","properties":{"RecFullHdl":{"type":"integer","comment":"存储空间满处理(0:循环记录/1：停止记录)","enum":[0,1]},"RecFSize":{"type":"integer","comment":"最大记录文件大小(MB)","minimum":2,"maximum":512},"RecErr":{"type":"integer","comment":"是否记录CAN错误帧(0:不记录/1：记录)","enum":[0,1]},"RecMer":{"type":"integer","comment":"通道记录数据是否合并(0：不合并/1:合并)","enum":[0,1]}}},"TrgMode":{"type":"object","comment":"CANDTU记录触发模式配置","nickname":"CANDTU记录触发模式配置","properties":{"RecMode":{"type":"integer","comment":"CAN记录模式(0：长时间记录/1:条件记录/2：预触发记录/3：定时记录/4：不记录)","enum":[0,1,2,3,4]},"ConRec":{"type":"object","comment":"条件记录配置对象","properties":{"StartChn":{"type":"integer","comment":"开始记录通道号","enum":[0,1]},"StartExt":{"type":"integer","comment":"开始记录帧类型（0：标准帧/1:扩展帧）","enum":[0,1]},"StartOp":{"type":"integer","comment":"开始记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StartIdS":{"type":"integer","comment":"开始记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StartIdL":{"type":"integer","comment":"开始记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopChn":{"type":"integer","comment":"停止记录通道号,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopExt":{"type":"integer","comment":"停止记录帧类型（0：标准帧/1:扩展帧),标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopOp":{"type":"integer","comment":"停止记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StopIdS":{"type":"integer","comment":"停止记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopIdL":{"type":"integer","comment":"停止记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}},"PreTrgRec":{"type":"object","comment":"预触发记录配置对象","properties":{"PreVal":{"type":"integer","comment":"预触发记录帧数","minimum":10,"maximum":100000},"PostVal":{"type":"integer","comment":"触发后记录时间(ms)","minimum":10,"maximum":86400000},"TrgNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":512},"TrgCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"TimRec":{"type":"object","comment":"定时记录配置对象","properties":{"Period":{"type":"object","comment":"定时时间周期（ms）","minimum":10,"maximum":86400000},"TmNDA":{"type":"object","comment":"定时时间内无数据记录方式（0：不记录/1：保存最近一次数据/2：保存自定义数据）","enum":[0,1,2]},"TmNDAUD":{"type":"string","comment":"定时时间内无记录保存的自定义数据（16进制保存为字符串）","minimum":0,"maximum":16},"FltNum":{"type":"integer","comment":"过滤条件数","minimum":0,"maximum":256},"FltCon":{"type":"array","comment":"过滤条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}}}},"Quota":{"type":"object","comment":"存储空间分配","nickname":"存储空间分配","properties":{"CAN0":{"type":"integer","comment":"CAN0占用空间百分比","minimum":0,"maximum":100},"CAN1":{"type":"integer","comment":"CAN1占用空间百分比","minimum":0,"maximum":100},"LIN0":{"type":"integer","comment":"LIN占用空间百分比","minimum":0,"maximum":100},"DI0":{"type":"integer","comment":"DI0占用空间百分比","minimum":0,"maximum":100},"DI1":{"type":"integer","comment":"DI1占用空间百分比","minimum":0,"maximum":100},"GPS":{"type":"integer","comment":"GPS占用空间百分比","minimum":0,"maximum":100}}},"GPSRec":{"type":"object","comment":"GPS记录配置","nickname":"GPS记录配置","properties":{"Enable":{"type":"integer","comment":"GPS记录使能（1：使能/0：失能）","enum":[0,1]},"Type":{"type":"integer","comment":"定位系统类型（0：自动选择/1：北斗/2：GPS）","enum":[0,1,2]},"Period":{"type":"integer","comment":"记录周期（s）","minimum":1,"maximum":1800}}},"SMS":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"SMS0":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS1":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS2":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS3":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS4":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS5":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}}}},"Net":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"Net0":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net1":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net2":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}}}},"NetFlt":{"type":"object","comment":"无线过滤配置","nickname":"无线过滤配置","properties":{"Enable":{"type":"integer","comment":"无线传输加密使能(1:使能/0：失能)","enum":[0,1]},"FltNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":256},"FltCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":256,"items":{"type":"object","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"过滤记录类型（0：ID滤波/1：时间段滤波）","enum":[0,1]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"NetGen":{"type":"object","comment":"无线通用配置","nickname":"无线通用配置","properties":{"Times":{"type":"integer","comment":"断网续传次数","enum":[0,1,2,3,4,5]},"Proto":{"type":"integer","comment":"加密协议编号","enum":[0,1]},"SendIdEn":{"type":"integer","comment":"网络数据携带设备ID和绝对时间戳使能","enum":[0,1]},"NetLogEn":{"type":"integer","comment":"网络调试日志使能","enum":[0,1]}}},"IotEn":{"type":"object","comment":"实时数据上传使能","nickname":"实时数据上传使能","properties":{"CAN0":{"type":"integer","comment":"CAN0数据上传使能(1:使能/0：失能)","enum":[0,1]},"CAN1":{"type":"integer","comment":"CAN1数据上传使能(1:使能/0：失能)","enum":[0,1]},"GPS":{"type":"integer","comment":"GPS数据上传使能(1:使能/0：失能)","enum":[0,1]},"LIN0":{"type":"integer","comment":"LIN数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI0":{"type":"integer","comment":"DI0数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI1":{"type":"integer","comment":"DI1数据上传使能(1:使能/0：失能)","enum":[0,1]}}}}},"SDStat":{"comment":"SD卡状态,0-SD卡未插入，1-SD卡插入，2-设备记录中，-1-设备无SD卡","nickname":"SD卡状态","type":"number","format":"int","enum":[0,1,2,-1]},"FwVer":{"comment":"固件版本号, 如：V1.00","nickname":"固件版本号","type":"string"},"HwVer":{"comment":"硬件版本号, 如：V1.00","nickname":"硬件版本号","type":"string"},"Serial":{"comment":"产品序列号, 8字符","nickname":"产品序列号","type":"string"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"StartRec":{"comment":"启动记录","nickname":"启动记录","cmdtype":true,"show_frontend":true},"StopRec":{"comment":"停止记录","nickname":"停止记录","cmdtype":true,"show_frontend":true},"ClrDev":{"comment":"清空设备","nickname":"清空设备","cmdtype":true,"show_frontend":true},"GetRecFileInfo":{"comment":"获取文件列表信息","nickname":"获取文件列表","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"StartTime":{"comment":"起始时间戳","nickname":"起始时间戳","type":"number","format":"int"},"StopTime":{"comment":"结束时间戳","nickname":"结束时间戳","type":"number","format":"int"}}},"GetRecFile":{"comment":"获取记录文件","nickname":"获取记录文件","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"Name":{"comment":"文件名","nickname":"文件名","type":"string"},"Offset":{"comment":"文件偏移","nickname":"文件偏移","type":"number","format":"int"},"Tag":{"comment":"本次传输文件标签","nickname":"文件标签","type":"number","format":"int"}}},"CancelGetRec":{"comment":"取消传输","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型","nickname":"数据类型","type":"number","format":"int"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"RecFull":{"comment":"记录满","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}}},"errors":{"err":{"comment":"CAN总线错误","args":{"chn":{"comment":"CAN错误通道","type":"number","format":"int"},"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"err_code":{"comment":"错误码","type":"number","format":"int"}}},"storge_err":{"comment":"存储状态异常","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}},"gps_err":{"comment":"GPS不在指定GPS区域","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"type":{"comment":"告警类型：1：短信通知设置的告警，2：DO输出设置的告警","type":"number","format":"int"},"longitude":{"comment":"经度","type":"number","format":"float"},"latitude":{"comment":"纬度","type":"number","format":"float"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","format":"int","type":"number"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1,"num":-1},"options":{"unique":true}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.01171875,"devices_size":0.08203125,"event_size":0.01171875,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"dtype_secret":"","owner":"zlg001","created_time":1568874135,"devtypeid":"5d831e97b137e8d9929fb9cc","devices":{"count":1},"uri":"/v1/devices/devtype/candtu-200"}]}
     * jwt : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE1NzA2MDExODEsImlzc3VlciI6Imh0dHBzOi8vd3d3LnpsZ2Nsb3VkLmNvbSIsImV4cCI6MTU3MTQ2NTE4MSwidXNlcmlkIjoiNWQ0YTIwMjU5ZThlMThmNjJiOWVmZDliIiwicm9sZSI6MCwidXNlcm5hbWUiOiJ6bGcwMDEiLCJtb2JpbGUiOiIxODY2NDYzMjg4NiIsImVtYWlsIjoiYWFhOTAwNzEyQDE2My5jb20iLCJkZXZfZXh0cmEiOnsiZGF0YV9leHBpcmUiOjEsImRhdGFfY2FwYWNpdHkiOjIwNDgsImRhdGFfc2l6ZSI6MjAuNDI5Njg3NSwidXBkYXRlX3RpbWUiOjE1NzA2MDA4MDIsImRldnR5cGVfY2FwYWNpdHkiOjEwLCJkZXZfY2FwYWNpdHkiOjIwfX0.yQFohG9oOBmiDgd_s_I5WA5zudNWcZb8mFqAw3k0G7c
     */

    private boolean result;
    private String message;
    private DataBeanX data;
    private String jwt;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public static class DataBeanX {
        /**
         * username : zlg001
         * mobile : 18664632886
         * role : 0
         * register_time : 1565138981
         * last_login_time : 1570601084
         * password_changed_time : 1565138981
         * register_ip : 121.33.243.34
         * last_login_ip : 218.19.99.66
         * dev_extra : {"data_expire":1,"data_capacity":2048,"data_size":20.4296875,"update_time":1570600802,"devtype_capacity":10,"dev_capacity":20}
         * status : normal
         * language : zh
         * nickname : TestMan
         * avatar : https://zlgcloud.oss-cn-shenzhen.aliyuncs.com/zlab/z/zlg001/images/avatar.png?time=1569835646177
         * desc : 我是JEST前端测试路过的！8
         * sysname : 物联网云平台
         * city : asd
         * detailaddress : China
         * company : Choormn
         * gender : 1
         * email : aaa900712@163.com
         * userid : 5d4a20259e8e18f62b9efd9b
         * uri : /v1/users/zlg001
         * device_types : [{"devtype":"zlg001_devtype_invert","basetype":"invert","schema":{"memo":{"desc":{"comment":"一代机三相机","maxLength":1024,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"test":{"nickname":"test","comment":"tes","unit":"","min":0,"max":0,"type":"number","format":"int"},"total_energy":{"comment":"总发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"总电量"},"today_energy":{"comment":"当天发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"今日发电量"},"temperature":{"comment":"逆变器温度","format":"float","type":"number","unit":"℃","min":0,"max":150,"nickname":"温度"},"gfci":{"comment":"对地漏电流","format":"float","type":"number","unit":"mA","min":0,"max":150},"bus_volt":{"comment":"BUS电压","format":"float","type":"number","unit":"V","min":0,"max":150,"nickname":"电压"},"power":{"comment":"逆变器输出有功功率","format":"float","type":"number","unit":"W","min":0,"max":6000,"nickname":"功率"},"q_power":{"comment":"逆变器输出无功功率","format":"float","type":"number","unit":"W","min":0,"max":1000},"pf":{"comment":"逆变器输出功率因数","format":"float","type":"number","unit":"","min":0,"max":1},"pv1_volt":{"comment":"直流输入电压pv1","format":"float","type":"number","unit":"V","min":0,"max":300},"pv1_curr":{"comment":"直流输入电流pv1","format":"float","type":"number","unit":"A","min":0,"max":20},"pv2_volt":{"comment":"直流输入电压pv2","format":"float","type":"number","unit":"V","min":0,"max":300},"pv2_curr":{"comment":"直流输入电流pv2","format":"float","type":"number","unit":"A","min":0,"max":20},"pv3_volt":{"comment":"直流输入电压pv3","format":"float","type":"number","unit":"V","min":0,"max":300},"pv3_curr":{"comment":"直流输入电流pv3","format":"float","type":"number","unit":"A","min":0,"max":20},"l1_volt":{"comment":"交流输出L1相电压","format":"float","type":"number","unit":"V","min":0,"max":300},"l1_curr":{"comment":"交流输出L1相电流","format":"float","type":"number","unit":"A","min":0,"max":220},"l1_freq":{"comment":"交流输出L1相频率","format":"float","type":"number","unit":"Hz","min":0,"max":400},"l1_dci":{"comment":"交流输出L1相直流分量","format":"float","type":"number","unit":"mA","min":0,"max":1000},"l1_power":{"comment":"交流输出L1相功率","format":"float","type":"number","unit":"W","min":0,"max":10000},"l1_pf":{"comment":"交流输出L1相功率因数","format":"float","type":"number","unit":"","min":0,"max":1}},"status":{"sw_ver1":{"comment":"software version1","min":0,"format":"float","type":"number"},"sw_ver2":{"comment":"software version2","min":0,"format":"float","type":"number"},"safety_spec":{"comment":"安规","min":0,"format":"float","type":"number"},"total_runtime":{"comment":"总运行时间","unit":"H","min":0,"format":"float","type":"number"},"today_runtime":{"comment":"当天运行时间","unit":"H","min":0,"format":"float","type":"number"},"clientip":{"comment":"client ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","type":"object","properties":{"version":{"comment":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","type":"string"},"version":{"comment":"新固件版本","type":"string"},"url":{"comment":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","type":"number","format":"int"}},"commands":{"set":{"comment":"set prop","cmdtype":true,"args":{"name":{"format":"name","type":"string"},"value":{"type":"string"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","cmdtype":true,"args":{"time":{"required":true,"type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"loginfo":{"comment":"日志信息","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":19.19140625,"devices_size":0.10546875,"event_size":0.08203125,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"f4204f80-ceed-11e9-a199-6f1bb8d247fd","owner":"zlg001","created_time":1567585700,"devtypeid":"5d6f75a4d2de0bf92dec0084","devices":{"count":3},"uri":"/v1/devices/devtype/zlg001_devtype_invert"},{"devtype":"zggw","basetype":"zggw","enable_secret":false,"schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":1,"max":1,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2)，LoraWan网关(3);此处必须为3，即LoraWan网关"},"desc":{"comment":"通用网关","maxLength":1024,"type":"string"},"node_gw_bydata":{"comment":"网关字段","type":"boolean","default":true},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{},"status":{"mac":{"comment":"网关的mac地址","type":"string","properties":{}},"time":{"comment":"网关当前的时间","unit":"ms","min":0,"type":"number","format":"float","minLength":0,"properties":{}},"rxnb":{"comment":"网关接受的包数量","min":0,"type":"number","format":"float","minLength":0,"properties":{}},"txnb":{"comment":"网关发送的包数量","min":0,"type":"number","format":"float","minLength":0,"properties":{}},"NodeCnt":{"comment":"网关挂载的节点数量","min":0,"type":"number","format":"float","minLength":0,"properties":{}},"maxNodeCnt":{"comment":"网关可挂载的最大节点数量","min":0,"max":5000,"type":"number","format":"float","maxLength":5000,"minLength":0,"properties":{}},"clientip":{"comment":"client ip","type":"string","maxLength":32,"properties":{}},"currentfm":{"comment":"设备当前固件的信息","type":"object","properties":{"version":{"comment":"当前固件版本","type":"string","required":true,"properties":""}}},"newfm":{"comment":"待升级固件的信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","required":true,"enums":[0,1],"properties":""},"devtype":{"comment":"设备型号","type":"string","properties":""},"version":{"comment":"新固件版本","type":"string","properties":""},"url":{"comment":"新固件地址","type":"string","properties":""}}},"gps":{"type":"object","comment":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度","properties":""},"longitude":{"type":"number","format":"float","comment":"纬度","properties":""},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int","properties":""}}},"fault":{"comment":"fault","type":"number","format":"int","properties":{}}},"commands":{"set_config":{"comment":"配置设备参数，与具体的设备有关","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","cmdtype":true,"args":{"time":{"required":true,"type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据"}}}},"warnings":{},"errors":{},"logs":{"loginfo":{"comment":"日志信息","args":{"info":{"comment":"日志信息","type":"string"},"level":{"comment":"日志等级","type":"number"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":true,"online_type":0,"verifyid":"","data_size":0.01171875,"devices_size":0.06640625,"event_size":0.01171875,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":1,"dtype_secret":"","owner":"zlg001","created_time":1567647223,"comment":"asdasdasdasdasdasddsasdasd","devtypeid":"5d7065f7d2de0bf872f23562","devices":{"count":1},"uri":"/v1/devices/devtype/zggw"},{"devtype":"invert","basetype":"invert","enable_secret":false,"schema":{"memo":{"desc":{"comment":"一代机三相机","maxLength":1024,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"total_energy":{"comment":"总发电量","nickname":"总发电量","unit":"kWh","min":0,"format":"float","type":"number"},"today_energy":{"comment":"当天发电量","nickname":"当天发电量","unit":"kWh","min":0,"format":"float","type":"number"},"temperature":{"comment":"逆变器温度","nickname":"逆变器温度","format":"float","type":"number","unit":"℃","min":0,"max":150},"gfci":{"comment":"对地漏电流","nickname":"对地漏电流","format":"float","type":"number","unit":"mA","min":0,"max":150},"bus_volt":{"comment":"BUS电压","nickname":"BUS电压","format":"float","type":"number","unit":"V","min":0,"max":150},"power":{"comment":"输出有功功率","nickname":"输出有功功率","format":"float","type":"number","unit":"W","min":0,"max":6000},"q_power":{"comment":"逆变器输出无功功率","nickname":"输出无功功率","format":"float","type":"number","unit":"W","min":0,"max":1000},"pf":{"comment":"逆变器输出功率因数","nickname":"输出功率因数","format":"float","type":"number","unit":"","min":0,"max":1},"pv1_volt":{"comment":"直流输入电压pv1","nickname":"直流输入电压pv1","format":"float","type":"number","unit":"V","min":0,"max":300},"pv1_curr":{"comment":"直流输入电流pv1","nickname":"直流输入电流pv1","format":"float","type":"number","unit":"A","min":0,"max":20},"pv2_volt":{"comment":"直流输入电压pv2","nickname":"直流输入电压pv2","format":"float","type":"number","unit":"V","min":0,"max":300},"pv2_curr":{"comment":"直流输入电流pv2","nickname":"直流输入电流pv2","format":"float","type":"number","unit":"A","min":0,"max":20},"pv3_volt":{"comment":"直流输入电压pv3","nickname":"直流输入电压pv3","format":"float","type":"number","unit":"V","min":0,"max":300},"pv3_curr":{"comment":"直流输入电流pv3","nickname":"直流输入电流pv3","format":"float","type":"number","unit":"A","min":0,"max":20},"l1_volt":{"comment":"交流输出L1相电压","nickname":"交流输出L1相电压","format":"float","type":"number","unit":"V","min":0,"max":300},"l1_curr":{"comment":"交流输出L1相电流","nickname":"交流输出L1相电流","format":"float","type":"number","unit":"A","min":0,"max":220},"l1_freq":{"comment":"交流输出L1相频率","nickname":"交流输出L1相频率","format":"float","type":"number","unit":"Hz","min":0,"max":400},"l1_dci":{"comment":"交流输出L1相直流分量","nickname":"交流输出L1相直流分量","format":"float","type":"number","unit":"mA","min":0,"max":1000},"l1_power":{"comment":"交流输出L1相功率","nickname":"交流输出L1相功率","format":"float","type":"number","unit":"W","min":0,"max":10000},"l1_pf":{"comment":"交流输出L1相功率因数","nickname":"交流输出L1相功率因数","format":"float","type":"number","unit":"","min":0,"max":1}},"status":{"sw_ver1":{"comment":"software version1","nickname":"软件版本1","min":0,"format":"float","type":"number"},"sw_ver2":{"comment":"software version2","nickname":"软件版本2","min":0,"format":"float","type":"number"},"safety_spec":{"comment":"安规","nickname":"安规","min":0,"format":"float","type":"number"},"total_runtime":{"comment":"总运行时间","nickname":"总运行时间","unit":"H","min":0,"format":"float","type":"number"},"today_runtime":{"comment":"当天运行时间","nickname":"当天运行时间","unit":"H","min":0,"format":"float","type":"number"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","nickname":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"set":{"comment":"set prop","nickname":"属性设置","cmdtype":true,"args":{"name":{"format":"name","nickname":"属性名","type":"string"},"value":{"nickname":"属性值","type":"string"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","format":"int","type":"number"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0,"devices_size":0.0703125,"event_size":0,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"dtype_secret":"","owner":"zlg001","created_time":1568777278,"comment":"ssss","devtypeid":"5d81a43eb137e81cc595615e","devices":{"count":0},"uri":"/v1/devices/devtype/invert"},{"devtype":"ClassB_","basetype":"LoRaWAN_CLASSB_OTAA","comment":"","lora_deviceprofile_id":"2d2fac91-00ad-4417-b5f3-064e629a66bf","schema":{"memo":{"devid":{"type":"string","readonly":true,"required":true,"minLength":16,"maxLength":16,"comment":"lorawan设备id，8字节16进制字符串"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型"},"devclass":{"type":"number","enums":[0,1,2,3],"min":2,"max":2,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"mqttadapter":{"type":"number","enums":[0,1],"required":true,"comment":"loraserver mqtt转换为何种zlgcloud mqtt：转为STR_TOPIC_REPORT_RAW(0)，转为STR_TOPIC_REPORT_DATA(1);请根据需要设置min=max=0，或min=max=1"},"appKey":{"type":"string","minLength":32,"maxLength":32,"comment":"OTAA使用的appKey,16字节16进制字符串"},"nwkKey":{"type":"string","minLength":32,"maxLength":32,"required":true,"comment":"OTAA使用的nwkKey,16字节16进制字符串"},"appEUI":{"type":"string","minLength":16,"maxLength":16,"required":true,"comment":"OTAA使用的appEUI,8字节16进制字符串"},"skipFCntCheck":{"type":"boolean","comment":"默认为true"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{"deviceProfile":{"classBTimeout":2,"classCTimeout":0,"factoryPresetFreqs":[0],"id":"","macVersion":"1.0.1","maxDutyCycle":0,"maxEIRP":0,"name":"zlg001_ClassB_","networkServerID":"","organizationID":"","pingSlotDR":5,"pingSlotFreq":0,"pingSlotPeriod":256,"regParamsRevision":"A","rfRegion":"CN_470_510","rxDROffset1":0,"rxDataRate2":0,"rxDelay1":1,"rxFreq2":505300000,"supports32BitFCnt":true,"supportsClassB":true,"supportsClassC":false,"supportsJoin":true}},"data":{"raw":{"comment":"数据","nickname":"数据","type":"string"},"loraserver":{"comment":"数据属性","nickname":"数据属性","type":"string"}},"status":{"appKey":{"comment":"应用秘钥","nickname":"应用秘钥","minLength":32,"maxLength":32,"readonly":true,"type":"string"},"appEUI":{"comment":"应用appEUI","nickname":"应用appEUI","minLength":16,"maxLength":16,"readonly":true,"type":"string"},"power":{"comment":"电量","nickname":"电量","min":0,"format":"float","type":"number"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","nickname":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"set":{"comment":"set prop","nickname":"设置属性","cmdtype":true,"args":{"name":{"format":"name","type":"string","nickname":"设置属性名"},"value":{"type":"string","nickname":"设置属性值"}}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["hex","ascii","base64"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"},"fPort":{"required":true,"type":"number","max":223,"min":1,"comment":"端口号","nickname":"端口号"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}}},"warnings":{"power_low":{"comment":"电量低","args":{"value":{"format":"float","type":"number"}}}},"errors":{"power_too_low":{"comment":"电量过低","args":{"value":{"format":"float","type":"number"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","type":"number","format":"int"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.046875,"devices_size":0.10546875,"event_size":0.046875,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":2,"enable_secret":false,"dtype_secret":"77909b40-d9e3-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568790659,"devtypeid":"5d81d883b137e8f1909709d2","devices":{"count":4},"uri":"/v1/devices/devtype/ClassB_"},{"devtype":"sasdasdA","basetype":"candtu-200","comment":"s2222","schema":{"memo":{"desc":{"comment":"两路CAN-bus数据记录仪","maxLength":1024,"type":"string"},"devname":{"comment":"设备名称","maxLength":31,"minLength":1,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"time":{"nickname":"时间","format":"float","type":"number"},"id":{"nickname":"CAN帧ID","format":"float","type":"number"},"flag":{"nickname":"报文标志","format":"float","type":"number"},"ch":{"nickname":"通道","format":"float","type":"number"},"len":{"nickname":"数据长度","format":"float","type":"number"},"data":{"nickname":"数据内容","type":"object"}},"status":{"devname":{"comment":"设备名, ASCII字符, 最长31个字符","nickname":"设备名","type":"string","minimum":1,"maximum":31},"model":{"comment":"设备型号","nickname":"设备型号","type":"string","enums":["CANDTU-200UWG","CANDTU-200UWGR","CANDTU-200UWGR-B"]},"gps":{"type":"object","comment":"gps定位。","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度。","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度。","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int","nickname":"GPS信息时间戳"}}},"CfgInfo":{"comment":"CANDTU配置","type":"object","nickname":"CANDTU配置","properties":{"CAN":{"type":"object","comment":"CAN配置","nickname":"CAN配置","properties":{"CAN0":{"type":"object","comment":"CAN0配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}},"CAN1":{"type":"object","comment":"CAN1配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}}}},"LIN":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"LIN0":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Baud":{"type":"integer","comment":"LIN波特率","minimum":1000,"maximum":20000},"DataLen":{"type":"integer","comment":"LIN数据长度","minimum":1,"maximum":8}}}}},"DI":{"type":"object","comment":"DI配置","nickname":"DI配置","properties":{"DI0":{"type":"object","comment":"DI配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"DI功能","enum":[0,1]},"Interval":{"type":"integer","comment":"DI记录间隔(ms)，DI功能为输入时有效","enum":[1,2,5,10,20,50,100,200,500,1000]}}}}},"DO":{"type":"object","comment":"DO配置","nickname":"DO配置","properties":{"DO0":{"type":"object","comment":"DO配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"告警条件，1：记录满，2：总线错误，3：存储状态异常，4：GPS区域告警","enum":[1,2,4,8]},"Output":{"type":"integer","comment":"DO告警时输出值","enum":[0,1]},"InOut":{"type":"integer","comment":"DO告警GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"DO告警GPS纬度"},"Long":{"type":"integer","comment":"DO告警GPS经度"},"Radius":{"type":"integer","comment":"DO告警GPS中心点半径","minimum":50,"maximum":10000}}}}},"RecCfg":{"type":"object","comment":"CANDTU记录配置","nickname":"CANDTU记录配置","properties":{"RecFullHdl":{"type":"integer","comment":"存储空间满处理(0:循环记录/1：停止记录)","enum":[0,1]},"RecFSize":{"type":"integer","comment":"最大记录文件大小(MB)","minimum":2,"maximum":512},"RecErr":{"type":"integer","comment":"是否记录CAN错误帧(0:不记录/1：记录)","enum":[0,1]},"RecMer":{"type":"integer","comment":"通道记录数据是否合并(0：不合并/1:合并)","enum":[0,1]}}},"TrgMode":{"type":"object","comment":"CANDTU记录触发模式配置","nickname":"CANDTU记录触发模式配置","properties":{"RecMode":{"type":"integer","comment":"CAN记录模式(0：长时间记录/1:条件记录/2：预触发记录/3：定时记录/4：不记录)","enum":[0,1,2,3,4]},"ConRec":{"type":"object","comment":"条件记录配置对象","properties":{"StartChn":{"type":"integer","comment":"开始记录通道号","enum":[0,1]},"StartExt":{"type":"integer","comment":"开始记录帧类型（0：标准帧/1:扩展帧）","enum":[0,1]},"StartOp":{"type":"integer","comment":"开始记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StartIdS":{"type":"integer","comment":"开始记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StartIdL":{"type":"integer","comment":"开始记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopChn":{"type":"integer","comment":"停止记录通道号,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopExt":{"type":"integer","comment":"停止记录帧类型（0：标准帧/1:扩展帧),标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopOp":{"type":"integer","comment":"停止记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StopIdS":{"type":"integer","comment":"停止记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopIdL":{"type":"integer","comment":"停止记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}},"PreTrgRec":{"type":"object","comment":"预触发记录配置对象","properties":{"PreVal":{"type":"integer","comment":"预触发记录帧数","minimum":10,"maximum":100000},"PostVal":{"type":"integer","comment":"触发后记录时间(ms)","minimum":10,"maximum":86400000},"TrgNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":512},"TrgCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"TimRec":{"type":"object","comment":"定时记录配置对象","properties":{"Period":{"type":"object","comment":"定时时间周期（ms）","minimum":10,"maximum":86400000},"TmNDA":{"type":"object","comment":"定时时间内无数据记录方式（0：不记录/1：保存最近一次数据/2：保存自定义数据）","enum":[0,1,2]},"TmNDAUD":{"type":"string","comment":"定时时间内无记录保存的自定义数据（16进制保存为字符串）","minimum":0,"maximum":16},"FltNum":{"type":"integer","comment":"过滤条件数","minimum":0,"maximum":256},"FltCon":{"type":"array","comment":"过滤条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}}}},"Quota":{"type":"object","comment":"存储空间分配","nickname":"存储空间分配","properties":{"CAN0":{"type":"integer","comment":"CAN0占用空间百分比","minimum":0,"maximum":100},"CAN1":{"type":"integer","comment":"CAN1占用空间百分比","minimum":0,"maximum":100},"LIN0":{"type":"integer","comment":"LIN占用空间百分比","minimum":0,"maximum":100},"DI0":{"type":"integer","comment":"DI0占用空间百分比","minimum":0,"maximum":100},"DI1":{"type":"integer","comment":"DI1占用空间百分比","minimum":0,"maximum":100},"GPS":{"type":"integer","comment":"GPS占用空间百分比","minimum":0,"maximum":100}}},"GPSRec":{"type":"object","comment":"GPS记录配置","nickname":"GPS记录配置","properties":{"Enable":{"type":"integer","comment":"GPS记录使能（1：使能/0：失能）","enum":[0,1]},"Type":{"type":"integer","comment":"定位系统类型（0：自动选择/1：北斗/2：GPS）","enum":[0,1,2]},"Period":{"type":"integer","comment":"记录周期（s）","minimum":1,"maximum":1800}}},"SMS":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"SMS0":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS1":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS2":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS3":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS4":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS5":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}}}},"Net":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"Net0":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net1":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net2":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}}}},"NetFlt":{"type":"object","comment":"无线过滤配置","nickname":"无线过滤配置","properties":{"Enable":{"type":"integer","comment":"无线传输加密使能(1:使能/0：失能)","enum":[0,1]},"FltNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":256},"FltCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":256,"items":{"type":"object","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"过滤记录类型（0：ID滤波/1：时间段滤波）","enum":[0,1]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"NetGen":{"type":"object","comment":"无线通用配置","nickname":"无线通用配置","properties":{"Times":{"type":"integer","comment":"断网续传次数","enum":[0,1,2,3,4,5]},"Proto":{"type":"integer","comment":"加密协议编号","enum":[0,1]},"SendIdEn":{"type":"integer","comment":"网络数据携带设备ID和绝对时间戳使能","enum":[0,1]},"NetLogEn":{"type":"integer","comment":"网络调试日志使能","enum":[0,1]}}},"IotEn":{"type":"object","comment":"实时数据上传使能","nickname":"实时数据上传使能","properties":{"CAN0":{"type":"integer","comment":"CAN0数据上传使能(1:使能/0：失能)","enum":[0,1]},"CAN1":{"type":"integer","comment":"CAN1数据上传使能(1:使能/0：失能)","enum":[0,1]},"GPS":{"type":"integer","comment":"GPS数据上传使能(1:使能/0：失能)","enum":[0,1]},"LIN0":{"type":"integer","comment":"LIN数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI0":{"type":"integer","comment":"DI0数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI1":{"type":"integer","comment":"DI1数据上传使能(1:使能/0：失能)","enum":[0,1]}}}}},"SDStat":{"comment":"SD卡状态,0-SD卡未插入，1-SD卡插入，2-设备记录中，-1-设备无SD卡","nickname":"SD卡状态","type":"number","format":"int","enum":[0,1,2,-1]},"FwVer":{"comment":"固件版本号, 如：V1.00","nickname":"固件版本号","type":"string"},"HwVer":{"comment":"硬件版本号, 如：V1.00","nickname":"硬件版本号","type":"string"},"Serial":{"comment":"产品序列号, 8字符","nickname":"产品序列号","type":"string"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"StartRec":{"comment":"启动记录","nickname":"启动记录","cmdtype":true,"show_frontend":true},"StopRec":{"comment":"停止记录","nickname":"停止记录","cmdtype":true,"show_frontend":true},"ClrDev":{"comment":"清空设备","nickname":"清空设备","cmdtype":true,"show_frontend":true},"GetRecFileInfo":{"comment":"获取文件列表信息","nickname":"获取文件列表","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"StartTime":{"comment":"起始时间戳","nickname":"起始时间戳","type":"number","format":"int"},"StopTime":{"comment":"结束时间戳","nickname":"结束时间戳","type":"number","format":"int"}}},"GetRecFile":{"comment":"获取记录文件","nickname":"获取记录文件","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"Name":{"comment":"文件名","nickname":"文件名","type":"string"},"Offset":{"comment":"文件偏移","nickname":"文件偏移","type":"number","format":"int"},"Tag":{"comment":"本次传输文件标签","nickname":"文件标签","type":"number","format":"int"}}},"CancelGetRec":{"comment":"取消传输","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型","nickname":"数据类型","type":"number","format":"int"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"RecFull":{"comment":"记录满","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}}},"errors":{"err":{"comment":"CAN总线错误","args":{"chn":{"comment":"CAN错误通道","type":"number","format":"int"},"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"err_code":{"comment":"错误码","type":"number","format":"int"}}},"storge_err":{"comment":"存储状态异常","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}},"gps_err":{"comment":"GPS不在指定GPS区域","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"type":{"comment":"告警类型：1：短信通知设置的告警，2：DO输出设置的告警","type":"number","format":"int"},"longitude":{"comment":"经度","type":"number","format":"float"},"latitude":{"comment":"纬度","type":"number","format":"float"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","format":"int","type":"number"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1,"num":-1},"options":{"unique":true}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0,"devices_size":0.01171875,"event_size":0,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"108bce80-d9fa-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568800365,"devtypeid":"5d81fe6db137e83b3a97fd28","devices":{"count":0},"uri":"/v1/devices/devtype/sasdasdA"},{"devtype":"zlg001linkwan","basetype":"demo","comment":"LinkWan手持网络分析仪","schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"pictureId":{"comment":"图片id","format":"name","type":"string"},"pointName":{"comment":"名称","format":"name","type":"string"},"pointType":{"comment":"点类型","format":"name","type":"string"},"pointId":{"comment":"点id","format":"name","type":"string"},"position":{"comment":"坐标","format":"json","type":"object"},"testResult":{"comment":"test结果","format":"json","type":"object"},"testSetting":{"comment":"test设置","format":"json","type":"object"},"testLevel":{"comment":"test等级","format":"name","type":"number"}},"status":{"devname":{"type":"string","comment":"设备名"},"deviceType":{"type":"string","comment":"设备类型"},"deveui":{"type":"string","comment":"设备唯一识别码"},"appeui":{"type":"string","comment":"应用唯一识别码"},"appkey":{"type":"string","comment":"应用密钥"},"addr":{"type":"string","comment":"ABP模式下的设备地址"},"appskey":{"type":"string","comment":"ABP模式下的应用密钥"},"nwkskey":{"type":"string","comment":"ABP模式下的网络密钥"},"mode":{"type":"string","comment":"入网方式"},"class":{"type":"string","comment":"设备类型"},"bandmask":{"type":"string","comment":"使用频段"},"freqtype":{"type":"number","comment":"频段模式"},"power":{"type":"number","comment":"发送功率"},"dr":{"type":"number","comment":"发送速率"},"sendByte":{"type":"number","comment":"发送字节数"},"antennaGain":{"type":"number","comment":"天线增益"}},"commands":{"set_report_interval":{"comment":"设置上报温度时间间隔","cmdtype":true,"args":{"value":{"type":"number","format":"int","comment":"单位为秒。"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"temperature_normal":{"comment":"工作温度正常","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0,"devices_size":0.01171875,"event_size":0,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"e895e7a0-da83-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568859568,"devtypeid":"5d82e5b0b137e80a369e08d4","devices":{"count":0},"uri":"/v1/devices/devtype/zlg001linkwan"},{"devtype":"zlg001lorawan","basetype":"demo","comment":"LoRaWan手持网络分析仪","schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"pictureId":{"comment":"图片id","format":"name","type":"string"},"pointName":{"comment":"名称","format":"name","type":"string"},"pointType":{"comment":"点类型","format":"name","type":"string"},"pointId":{"comment":"点id","format":"name","type":"string"},"position":{"comment":"坐标","format":"json","type":"object"},"testResult":{"comment":"test结果","format":"json","type":"object"},"testSetting":{"comment":"test设置","format":"json","type":"object"},"testLevel":{"comment":"test等级","format":"name","type":"number"}},"status":{"devname":{"type":"string","comment":"设备名"},"deviceType":{"type":"string","comment":"设备类型"},"deveui":{"type":"string","comment":"设备唯一识别码"},"appeui":{"type":"string","comment":"应用唯一识别码"},"appkey":{"type":"string","comment":"应用密钥"},"addr":{"type":"string","comment":"ABP模式下的设备地址"},"appskey":{"type":"string","comment":"ABP模式下的应用密钥"},"nwkskey":{"type":"string","comment":"ABP模式下的网络密钥"},"mode":{"type":"string","comment":"入网方式"},"class":{"type":"string","comment":"设备类型"},"band":{"type":"string","comment":"使用频段"},"LRCHMASK":{"type":"string","comment":"上行频点"},"power":{"type":"number","comment":"发送功率"},"dr":{"type":"number","comment":"发送速率"},"sendByte":{"type":"number","comment":"发送字节数"},"antennaGain":{"type":"number","comment":"天线增益"}},"commands":{"set_report_interval":{"comment":"设置上报温度时间间隔","cmdtype":true,"args":{"value":{"type":"number","format":"int","comment":"单位为秒。"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"temperature_normal":{"comment":"工作温度正常","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.01171875,"devices_size":0.08203125,"event_size":0.01171875,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"e896f910-da83-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568859568,"devtypeid":"5d82e5b0b137e85aeb9e08d5","devices":{"count":1},"uri":"/v1/devices/devtype/zlg001lorawan"},{"devtype":"zlg001zigbee","basetype":"demo","comment":"ZigBee手持网络分析仪","schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"pictureId":{"comment":"图片id","format":"name","type":"string"},"pointName":{"comment":"名称","format":"name","type":"string"},"pointType":{"comment":"点类型","format":"name","type":"string"},"pointId":{"comment":"点id","format":"name","type":"string"},"position":{"comment":"坐标","format":"json","type":"object"},"testResult":{"comment":"test结果","format":"json","type":"object"},"testSetting":{"comment":"test设置","format":"json","type":"object"},"testLevel":{"comment":"test等级","format":"name","type":"number"}},"status":{"devname":{"type":"string","comment":"设备名"},"deviceType":{"type":"string","comment":"设备类型"},"chan":{"type":"string","comment":"设备通道号"},"panId":{"type":"string","comment":"设备网络号"},"moduleKey":{"type":"string","comment":"设备密钥"},"myAddr":{"type":"string","comment":"本地网络地址"},"dstAddr":{"type":"string","comment":"目标网络地址"},"powerLevel":{"type":"string","comment":"发送功率"},"antennaGain":{"type":"string","comment":"天线增益"},"addr_type":{"type":"number","comment":"目标地址类型"},"dstIEEE":{"type":"string","comment":"目标MAC地址"},"devType":{"type":"string","comment":"zigbee设备类型"}},"commands":{"set_report_interval":{"comment":"设置上报温度时间间隔","cmdtype":true,"args":{"value":{"type":"number","format":"int","comment":"单位为秒。"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"temperature_normal":{"comment":"工作温度正常","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.03515625,"devices_size":0.10546875,"event_size":0.03515625,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"e8987fb0-da83-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568859568,"devtypeid":"5d82e5b0b137e827dc9e08d6","devices":{"count":3},"uri":"/v1/devices/devtype/zlg001zigbee"},{"devtype":"demo","basetype":"demo","enable_secret":false,"schema":{"memo":{"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"desc":{"comment":"设备备注","maxLength":1024,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"temp":{"comment":"温度","format":"float","type":"number"}},"status":{"sw_version":{"comment":"software version","format":"float","type":"number"},"settings":{"comment":"settings","type":"object","properties":{"firstName":{"type":"string"},"lastName":{"type":"string"},"age":{"description":"Age in years","type":"integer","minimum":0}},"required":["firstName","lastName"]},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","nickname":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"set_report_interval":{"comment":"设置上报温度时间间隔","cmdtype":true,"args":{"value":{"type":"number","format":"int","comment":"单位为秒。"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"temperature_normal":{"comment":"工作温度正常","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.08203125,"devices_size":0.10546875,"event_size":0.08203125,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"dtype_secret":"","owner":"zlg001","created_time":1568860339,"devtypeid":"5d82e8b3b137e81bcb9e1fb3","devices":{"count":7},"uri":"/v1/devices/devtype/demo"},{"devtype":"CANDTU200","basetype":"candtu-200","comment":"sssss","schema":{"memo":{"desc":{"comment":"两路CAN-bus数据记录仪","maxLength":1024,"type":"string"},"devname":{"comment":"设备名称","maxLength":31,"minLength":1,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"time":{"nickname":"时间","format":"float","type":"number"},"id":{"nickname":"CAN帧ID","format":"float","type":"number"},"flag":{"nickname":"报文标志","format":"float","type":"number"},"ch":{"nickname":"通道","format":"float","type":"number"},"len":{"nickname":"数据长度","format":"float","type":"number"},"data":{"nickname":"数据内容","type":"object"}},"status":{"devname":{"comment":"设备名, ASCII字符, 最长31个字符","nickname":"设备名","type":"string","minimum":1,"maximum":31},"model":{"comment":"设备型号","nickname":"设备型号","type":"string","enums":["CANDTU-200UWG","CANDTU-200UWGR","CANDTU-200UWGR-B"]},"gps":{"type":"object","comment":"gps定位。","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度。","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度。","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int","nickname":"GPS信息时间戳"}}},"CfgInfo":{"comment":"CANDTU配置","type":"object","nickname":"CANDTU配置","properties":{"CAN":{"type":"object","comment":"CAN配置","nickname":"CAN配置","properties":{"CAN0":{"type":"object","comment":"CAN0配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}},"CAN1":{"type":"object","comment":"CAN1配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}}}},"LIN":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"LIN0":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Baud":{"type":"integer","comment":"LIN波特率","minimum":1000,"maximum":20000},"DataLen":{"type":"integer","comment":"LIN数据长度","minimum":1,"maximum":8}}}}},"DI":{"type":"object","comment":"DI配置","nickname":"DI配置","properties":{"DI0":{"type":"object","comment":"DI配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"DI功能","enum":[0,1]},"Interval":{"type":"integer","comment":"DI记录间隔(ms)，DI功能为输入时有效","enum":[1,2,5,10,20,50,100,200,500,1000]}}}}},"DO":{"type":"object","comment":"DO配置","nickname":"DO配置","properties":{"DO0":{"type":"object","comment":"DO配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"告警条件，1：记录满，2：总线错误，3：存储状态异常，4：GPS区域告警","enum":[1,2,4,8]},"Output":{"type":"integer","comment":"DO告警时输出值","enum":[0,1]},"InOut":{"type":"integer","comment":"DO告警GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"DO告警GPS纬度"},"Long":{"type":"integer","comment":"DO告警GPS经度"},"Radius":{"type":"integer","comment":"DO告警GPS中心点半径","minimum":50,"maximum":10000}}}}},"RecCfg":{"type":"object","comment":"CANDTU记录配置","nickname":"CANDTU记录配置","properties":{"RecFullHdl":{"type":"integer","comment":"存储空间满处理(0:循环记录/1：停止记录)","enum":[0,1]},"RecFSize":{"type":"integer","comment":"最大记录文件大小(MB)","minimum":2,"maximum":512},"RecErr":{"type":"integer","comment":"是否记录CAN错误帧(0:不记录/1：记录)","enum":[0,1]},"RecMer":{"type":"integer","comment":"通道记录数据是否合并(0：不合并/1:合并)","enum":[0,1]}}},"TrgMode":{"type":"object","comment":"CANDTU记录触发模式配置","nickname":"CANDTU记录触发模式配置","properties":{"RecMode":{"type":"integer","comment":"CAN记录模式(0：长时间记录/1:条件记录/2：预触发记录/3：定时记录/4：不记录)","enum":[0,1,2,3,4]},"ConRec":{"type":"object","comment":"条件记录配置对象","properties":{"StartChn":{"type":"integer","comment":"开始记录通道号","enum":[0,1]},"StartExt":{"type":"integer","comment":"开始记录帧类型（0：标准帧/1:扩展帧）","enum":[0,1]},"StartOp":{"type":"integer","comment":"开始记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StartIdS":{"type":"integer","comment":"开始记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StartIdL":{"type":"integer","comment":"开始记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopChn":{"type":"integer","comment":"停止记录通道号,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopExt":{"type":"integer","comment":"停止记录帧类型（0：标准帧/1:扩展帧),标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopOp":{"type":"integer","comment":"停止记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StopIdS":{"type":"integer","comment":"停止记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopIdL":{"type":"integer","comment":"停止记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}},"PreTrgRec":{"type":"object","comment":"预触发记录配置对象","properties":{"PreVal":{"type":"integer","comment":"预触发记录帧数","minimum":10,"maximum":100000},"PostVal":{"type":"integer","comment":"触发后记录时间(ms)","minimum":10,"maximum":86400000},"TrgNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":512},"TrgCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"TimRec":{"type":"object","comment":"定时记录配置对象","properties":{"Period":{"type":"object","comment":"定时时间周期（ms）","minimum":10,"maximum":86400000},"TmNDA":{"type":"object","comment":"定时时间内无数据记录方式（0：不记录/1：保存最近一次数据/2：保存自定义数据）","enum":[0,1,2]},"TmNDAUD":{"type":"string","comment":"定时时间内无记录保存的自定义数据（16进制保存为字符串）","minimum":0,"maximum":16},"FltNum":{"type":"integer","comment":"过滤条件数","minimum":0,"maximum":256},"FltCon":{"type":"array","comment":"过滤条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}}}},"Quota":{"type":"object","comment":"存储空间分配","nickname":"存储空间分配","properties":{"CAN0":{"type":"integer","comment":"CAN0占用空间百分比","minimum":0,"maximum":100},"CAN1":{"type":"integer","comment":"CAN1占用空间百分比","minimum":0,"maximum":100},"LIN0":{"type":"integer","comment":"LIN占用空间百分比","minimum":0,"maximum":100},"DI0":{"type":"integer","comment":"DI0占用空间百分比","minimum":0,"maximum":100},"DI1":{"type":"integer","comment":"DI1占用空间百分比","minimum":0,"maximum":100},"GPS":{"type":"integer","comment":"GPS占用空间百分比","minimum":0,"maximum":100}}},"GPSRec":{"type":"object","comment":"GPS记录配置","nickname":"GPS记录配置","properties":{"Enable":{"type":"integer","comment":"GPS记录使能（1：使能/0：失能）","enum":[0,1]},"Type":{"type":"integer","comment":"定位系统类型（0：自动选择/1：北斗/2：GPS）","enum":[0,1,2]},"Period":{"type":"integer","comment":"记录周期（s）","minimum":1,"maximum":1800}}},"SMS":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"SMS0":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS1":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS2":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS3":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS4":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS5":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}}}},"Net":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"Net0":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net1":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net2":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}}}},"NetFlt":{"type":"object","comment":"无线过滤配置","nickname":"无线过滤配置","properties":{"Enable":{"type":"integer","comment":"无线传输加密使能(1:使能/0：失能)","enum":[0,1]},"FltNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":256},"FltCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":256,"items":{"type":"object","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"过滤记录类型（0：ID滤波/1：时间段滤波）","enum":[0,1]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"NetGen":{"type":"object","comment":"无线通用配置","nickname":"无线通用配置","properties":{"Times":{"type":"integer","comment":"断网续传次数","enum":[0,1,2,3,4,5]},"Proto":{"type":"integer","comment":"加密协议编号","enum":[0,1]},"SendIdEn":{"type":"integer","comment":"网络数据携带设备ID和绝对时间戳使能","enum":[0,1]},"NetLogEn":{"type":"integer","comment":"网络调试日志使能","enum":[0,1]}}},"IotEn":{"type":"object","comment":"实时数据上传使能","nickname":"实时数据上传使能","properties":{"CAN0":{"type":"integer","comment":"CAN0数据上传使能(1:使能/0：失能)","enum":[0,1]},"CAN1":{"type":"integer","comment":"CAN1数据上传使能(1:使能/0：失能)","enum":[0,1]},"GPS":{"type":"integer","comment":"GPS数据上传使能(1:使能/0：失能)","enum":[0,1]},"LIN0":{"type":"integer","comment":"LIN数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI0":{"type":"integer","comment":"DI0数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI1":{"type":"integer","comment":"DI1数据上传使能(1:使能/0：失能)","enum":[0,1]}}}}},"SDStat":{"comment":"SD卡状态,0-SD卡未插入，1-SD卡插入，2-设备记录中，-1-设备无SD卡","nickname":"SD卡状态","type":"number","format":"int","enum":[0,1,2,-1]},"FwVer":{"comment":"固件版本号, 如：V1.00","nickname":"固件版本号","type":"string"},"HwVer":{"comment":"硬件版本号, 如：V1.00","nickname":"硬件版本号","type":"string"},"Serial":{"comment":"产品序列号, 8字符","nickname":"产品序列号","type":"string"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"StartRec":{"comment":"启动记录","nickname":"启动记录","cmdtype":true,"show_frontend":true},"StopRec":{"comment":"停止记录","nickname":"停止记录","cmdtype":true,"show_frontend":true},"ClrDev":{"comment":"清空设备","nickname":"清空设备","cmdtype":true,"show_frontend":true},"GetRecFileInfo":{"comment":"获取文件列表信息","nickname":"获取文件列表","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"StartTime":{"comment":"起始时间戳","nickname":"起始时间戳","type":"number","format":"int"},"StopTime":{"comment":"结束时间戳","nickname":"结束时间戳","type":"number","format":"int"}}},"GetRecFile":{"comment":"获取记录文件","nickname":"获取记录文件","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"Name":{"comment":"文件名","nickname":"文件名","type":"string"},"Offset":{"comment":"文件偏移","nickname":"文件偏移","type":"number","format":"int"},"Tag":{"comment":"本次传输文件标签","nickname":"文件标签","type":"number","format":"int"}}},"CancelGetRec":{"comment":"取消传输","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型","nickname":"数据类型","type":"number","format":"int"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"RecFull":{"comment":"记录满","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}}},"errors":{"err":{"comment":"CAN总线错误","args":{"chn":{"comment":"CAN错误通道","type":"number","format":"int"},"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"err_code":{"comment":"错误码","type":"number","format":"int"}}},"storge_err":{"comment":"存储状态异常","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}},"gps_err":{"comment":"GPS不在指定GPS区域","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"type":{"comment":"告警类型：1：短信通知设置的告警，2：DO输出设置的告警","type":"number","format":"int"},"longitude":{"comment":"经度","type":"number","format":"float"},"latitude":{"comment":"纬度","type":"number","format":"float"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","format":"int","type":"number"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1,"num":-1},"options":{"unique":true}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0,"devices_size":0.01171875,"event_size":0,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"enable_secret":false,"dtype_secret":"891f0000-daa5-11e9-bc57-8fbfcbdf82ac","owner":"zlg001","created_time":1568874011,"devtypeid":"5d831e1bb137e885bb9fb619","devices":{"count":0},"uri":"/v1/devices/devtype/CANDTU200"},{"devtype":"candtu-200","basetype":"candtu-200","enable_secret":false,"schema":{"memo":{"desc":{"comment":"两路CAN-bus数据记录仪","maxLength":1024,"type":"string"},"devname":{"comment":"设备名称","maxLength":31,"minLength":1,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"time":{"nickname":"时间","format":"float","type":"number"},"id":{"nickname":"CAN帧ID","format":"float","type":"number"},"flag":{"nickname":"报文标志","format":"float","type":"number"},"ch":{"nickname":"通道","format":"float","type":"number"},"len":{"nickname":"数据长度","format":"float","type":"number"},"data":{"nickname":"数据内容","type":"object"}},"status":{"devname":{"comment":"设备名, ASCII字符, 最长31个字符","nickname":"设备名","type":"string","minimum":1,"maximum":31},"model":{"comment":"设备型号","nickname":"设备型号","type":"string","enums":["CANDTU-200UWG","CANDTU-200UWGR","CANDTU-200UWGR-B"]},"gps":{"type":"object","comment":"gps定位。","nickname":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度。","nickname":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度。","nickname":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int","nickname":"GPS信息时间戳"}}},"CfgInfo":{"comment":"CANDTU配置","type":"object","nickname":"CANDTU配置","properties":{"CAN":{"type":"object","comment":"CAN配置","nickname":"CAN配置","properties":{"CAN0":{"type":"object","comment":"CAN0配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}},"CAN1":{"type":"object","comment":"CAN1配置","properties":{"Chn":{"type":"integer","comment":"CAN通道","enum":[0,1]},"Enable":{"type":"integer","comment":"通道通道使能(1)/失能(0)","enum":[0,1]},"ResEn":{"type":"integer","comment":"终端电阻使能(1)/失能(0)","enum":[0,1]},"Mode":{"type":"integer","comment":"CAN工作模式：正常模式(0)/只听模式(1)","enum":[0,1]},"BpsBrp":{"type":"integer","comment":"CAN波特率BRP","minimum":1,"maximum":255},"BpsSjw":{"type":"integer","comment":"CAN波特率Sjw","minimum":0,"maximum":3},"BpsSeg1":{"type":"integer","comment":"CAN波特率Seg1","minimum":3,"maximum":14},"BpsSeg2":{"type":"integer","comment":"CAN波特率Seg2","minimum":1,"maximum":7},"BpsSmp":{"type":"integer","comment":"CAN波特率Smp","enum":[0]},"FltFmat":{"type":"integer","comment":"CAN滤波格式","enum":[0]},"Flt":{"type":"array","comment":"CAN滤波表","minItems":8,"maxItems":8,"items":{"type":"object","properties":{"Mask":{"type":"integer","comment":"CAN滤波屏蔽码"},"Acc":{"type":"integer","comment":"CAN滤波过滤码"}}}},"clock":{"type":"number","comment":"时钟"}}}}},"LIN":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"LIN0":{"type":"object","comment":"LIN配置","nickname":"LIN配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Baud":{"type":"integer","comment":"LIN波特率","minimum":1000,"maximum":20000},"DataLen":{"type":"integer","comment":"LIN数据长度","minimum":1,"maximum":8}}}}},"DI":{"type":"object","comment":"DI配置","nickname":"DI配置","properties":{"DI0":{"type":"object","comment":"DI配置","properties":{"Chn":{"type":"integer","comment":"通道","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"DI功能","enum":[0,1]},"Interval":{"type":"integer","comment":"DI记录间隔(ms)，DI功能为输入时有效","enum":[1,2,5,10,20,50,100,200,500,1000]}}}}},"DO":{"type":"object","comment":"DO配置","nickname":"DO配置","properties":{"DO0":{"type":"object","comment":"DO配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0]},"Enable":{"type":"integer","comment":"通道使能(1)/失能(0)","enum":[0,1]},"Func":{"type":"integer","comment":"告警条件，1：记录满，2：总线错误，3：存储状态异常，4：GPS区域告警","enum":[1,2,4,8]},"Output":{"type":"integer","comment":"DO告警时输出值","enum":[0,1]},"InOut":{"type":"integer","comment":"DO告警GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"DO告警GPS纬度"},"Long":{"type":"integer","comment":"DO告警GPS经度"},"Radius":{"type":"integer","comment":"DO告警GPS中心点半径","minimum":50,"maximum":10000}}}}},"RecCfg":{"type":"object","comment":"CANDTU记录配置","nickname":"CANDTU记录配置","properties":{"RecFullHdl":{"type":"integer","comment":"存储空间满处理(0:循环记录/1：停止记录)","enum":[0,1]},"RecFSize":{"type":"integer","comment":"最大记录文件大小(MB)","minimum":2,"maximum":512},"RecErr":{"type":"integer","comment":"是否记录CAN错误帧(0:不记录/1：记录)","enum":[0,1]},"RecMer":{"type":"integer","comment":"通道记录数据是否合并(0：不合并/1:合并)","enum":[0,1]}}},"TrgMode":{"type":"object","comment":"CANDTU记录触发模式配置","nickname":"CANDTU记录触发模式配置","properties":{"RecMode":{"type":"integer","comment":"CAN记录模式(0：长时间记录/1:条件记录/2：预触发记录/3：定时记录/4：不记录)","enum":[0,1,2,3,4]},"ConRec":{"type":"object","comment":"条件记录配置对象","properties":{"StartChn":{"type":"integer","comment":"开始记录通道号","enum":[0,1]},"StartExt":{"type":"integer","comment":"开始记录帧类型（0：标准帧/1:扩展帧）","enum":[0,1]},"StartOp":{"type":"integer","comment":"开始记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StartIdS":{"type":"integer","comment":"开始记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StartIdL":{"type":"integer","comment":"开始记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopChn":{"type":"integer","comment":"停止记录通道号,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopExt":{"type":"integer","comment":"停止记录帧类型（0：标准帧/1:扩展帧),标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopOp":{"type":"integer","comment":"停止记录条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"StopIdS":{"type":"integer","comment":"停止记录起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"StopIdL":{"type":"integer","comment":"停止记录结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}},"PreTrgRec":{"type":"object","comment":"预触发记录配置对象","properties":{"PreVal":{"type":"integer","comment":"预触发记录帧数","minimum":10,"maximum":100000},"PostVal":{"type":"integer","comment":"触发后记录时间(ms)","minimum":10,"maximum":86400000},"TrgNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":512},"TrgCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"TimRec":{"type":"object","comment":"定时记录配置对象","properties":{"Period":{"type":"object","comment":"定时时间周期（ms）","minimum":10,"maximum":86400000},"TmNDA":{"type":"object","comment":"定时时间内无数据记录方式（0：不记录/1：保存最近一次数据/2：保存自定义数据）","enum":[0,1,2]},"TmNDAUD":{"type":"string","comment":"定时时间内无记录保存的自定义数据（16进制保存为字符串）","minimum":0,"maximum":16},"FltNum":{"type":"integer","comment":"过滤条件数","minimum":0,"maximum":256},"FltCon":{"type":"array","comment":"过滤条件列表","minItems":1,"maxItems":512,"items":{"type":"object","comment":"触发条件对象","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"触发记录类型（0：ID触发/1:错误帧触发/2：按键触发/3:DI触发）","enum":[0,1,2,3]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}}}},"Quota":{"type":"object","comment":"存储空间分配","nickname":"存储空间分配","properties":{"CAN0":{"type":"integer","comment":"CAN0占用空间百分比","minimum":0,"maximum":100},"CAN1":{"type":"integer","comment":"CAN1占用空间百分比","minimum":0,"maximum":100},"LIN0":{"type":"integer","comment":"LIN占用空间百分比","minimum":0,"maximum":100},"DI0":{"type":"integer","comment":"DI0占用空间百分比","minimum":0,"maximum":100},"DI1":{"type":"integer","comment":"DI1占用空间百分比","minimum":0,"maximum":100},"GPS":{"type":"integer","comment":"GPS占用空间百分比","minimum":0,"maximum":100}}},"GPSRec":{"type":"object","comment":"GPS记录配置","nickname":"GPS记录配置","properties":{"Enable":{"type":"integer","comment":"GPS记录使能（1：使能/0：失能）","enum":[0,1]},"Type":{"type":"integer","comment":"定位系统类型（0：自动选择/1：北斗/2：GPS）","enum":[0,1,2]},"Period":{"type":"integer","comment":"记录周期（s）","minimum":1,"maximum":1800}}},"SMS":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"SMS0":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS1":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS2":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS3":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS4":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}},"SMS5":{"type":"object","comment":"短信告警配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Func":{"type":"integer","comment":"报警功能类型：1-记录满，2-CAN总线错误，4-SD卡异常，8-GPS区域告警","enum":[1,2,4,8]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"Num":{"type":"string","comment":"报警手机号码,12字节字符串"},"InOut":{"type":"integer","comment":"GPS范围设置，0内部，1外部","enum":[0,1]},"Lat":{"type":"integer","comment":"GPS纬度"},"Long":{"type":"integer","comment":"GPS经度"},"Radius":{"type":"integer","comment":"GPS中心点半径","minimum":50,"maximum":10000}}}}},"Net":{"type":"object","comment":"短信配置","nickname":"短信配置","properties":{"Net0":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net1":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}},"Net2":{"type":"object","comment":"网络连接配置","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1,2]},"Proto":{"type":"integer","comment":"协议类型，0-TCP客户端","enum":[0]},"Enable":{"type":"integer","comment":"使能（1：使能/0：失能）","enum":[0,1]},"LPort":{"type":"integer","comment":"本机端口","minimum":0,"maximum":65535},"RAddr":{"type":"string","comment":"远程IP地址,最长64字节字符串"},"RPort":{"type":"integer","comment":"远程端口","minimum":1,"maximum":65535}}}}},"NetFlt":{"type":"object","comment":"无线过滤配置","nickname":"无线过滤配置","properties":{"Enable":{"type":"integer","comment":"无线传输加密使能(1:使能/0：失能)","enum":[0,1]},"FltNum":{"type":"integer","comment":"触发条件数","minimum":1,"maximum":256},"FltCon":{"type":"array","comment":"触发条件列表","minItems":1,"maxItems":256,"items":{"type":"object","properties":{"Chn":{"type":"integer","comment":"通道号","enum":[0,1]},"Type":{"type":"integer","comment":"过滤记录类型（0：ID滤波/1：时间段滤波）","enum":[0,1]},"Op":{"type":"integer","comment":"触发条件(0:等于/1:不等于/2:小于/3：小于等于/4：大于/5：大于等于/6：在范围内/7：在范围外)","enum":[0,1,2,3,4,5,6,7]},"Ext":{"type":"integer","comment":"是否为扩展帧（0：标准帧/1：扩展帧）","enum":[0,1]},"IdS":{"type":"integer","comment":"触发条件起始帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823},"IdL":{"type":"integer","comment":"触发条件结束帧ID,标准帧最大为0x7FF,扩展帧最大为0x3FFFFFFF","minimum":0,"maximum":1073741823}}}}}},"NetGen":{"type":"object","comment":"无线通用配置","nickname":"无线通用配置","properties":{"Times":{"type":"integer","comment":"断网续传次数","enum":[0,1,2,3,4,5]},"Proto":{"type":"integer","comment":"加密协议编号","enum":[0,1]},"SendIdEn":{"type":"integer","comment":"网络数据携带设备ID和绝对时间戳使能","enum":[0,1]},"NetLogEn":{"type":"integer","comment":"网络调试日志使能","enum":[0,1]}}},"IotEn":{"type":"object","comment":"实时数据上传使能","nickname":"实时数据上传使能","properties":{"CAN0":{"type":"integer","comment":"CAN0数据上传使能(1:使能/0：失能)","enum":[0,1]},"CAN1":{"type":"integer","comment":"CAN1数据上传使能(1:使能/0：失能)","enum":[0,1]},"GPS":{"type":"integer","comment":"GPS数据上传使能(1:使能/0：失能)","enum":[0,1]},"LIN0":{"type":"integer","comment":"LIN数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI0":{"type":"integer","comment":"DI0数据上传使能(1:使能/0：失能)","enum":[0,1]},"DI1":{"type":"integer","comment":"DI1数据上传使能(1:使能/0：失能)","enum":[0,1]}}}}},"SDStat":{"comment":"SD卡状态,0-SD卡未插入，1-SD卡插入，2-设备记录中，-1-设备无SD卡","nickname":"SD卡状态","type":"number","format":"int","enum":[0,1,2,-1]},"FwVer":{"comment":"固件版本号, 如：V1.00","nickname":"固件版本号","type":"string"},"HwVer":{"comment":"硬件版本号, 如：V1.00","nickname":"硬件版本号","type":"string"},"Serial":{"comment":"产品序列号, 8字符","nickname":"产品序列号","type":"string"},"clientip":{"comment":"client ip","nickname":"客户端ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","nickname":"设备当前固件信息","type":"object","properties":{"version":{"comment":"当前固件版本","nickname":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","nickname":"待升级固件信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","nickname":"是否存在待升级固件","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","nickname":"设备型号","type":"string"},"version":{"comment":"新固件版本","nickname":"新固件版本","type":"string"},"url":{"comment":"新固件地址","nickname":"新固件地址","type":"string"}}},"fault":{"comment":"fault","nickname":"是否","type":"number","format":"int"}},"commands":{"StartRec":{"comment":"启动记录","nickname":"启动记录","cmdtype":true,"show_frontend":true},"StopRec":{"comment":"停止记录","nickname":"停止记录","cmdtype":true,"show_frontend":true},"ClrDev":{"comment":"清空设备","nickname":"清空设备","cmdtype":true,"show_frontend":true},"GetRecFileInfo":{"comment":"获取文件列表信息","nickname":"获取文件列表","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"StartTime":{"comment":"起始时间戳","nickname":"起始时间戳","type":"number","format":"int"},"StopTime":{"comment":"结束时间戳","nickname":"结束时间戳","type":"number","format":"int"}}},"GetRecFile":{"comment":"获取记录文件","nickname":"获取记录文件","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型, 0-CAN0, 1-CAN1, 16-GPS, 32-LIN, 48-DI, 240-合并CAN","nickname":"数据类型","type":"number","format":"int","enum":[0,1,16,32,48,240]},"Name":{"comment":"文件名","nickname":"文件名","type":"string"},"Offset":{"comment":"文件偏移","nickname":"文件偏移","type":"number","format":"int"},"Tag":{"comment":"本次传输文件标签","nickname":"文件标签","type":"number","format":"int"}}},"CancelGetRec":{"comment":"取消传输","cmdtype":true,"args":{"RecType":{"comment":"指定数据类型","nickname":"数据类型","type":"number","format":"int"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","nickname":"配置设备参数","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","nickname":"同步时间","cmdtype":true,"args":{"time":{"required":true,"nickname":"时间","type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","nickname":"通知设备有新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","nickname":"通知设备更新固件","cmdtype":true,"args":{"devtype":{"nickname":"设备类型","required":true,"type":"string"},"version":{"nickname":"固件版本","required":true,"type":"string"},"url":{"nickname":"固件url","required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","nickname":"上报最新数据","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","nickname":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式","nickname":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据","nickname":"数据"}}}},"warnings":{"RecFull":{"comment":"记录满","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}}},"errors":{"err":{"comment":"CAN总线错误","args":{"chn":{"comment":"CAN错误通道","type":"number","format":"int"},"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"err_code":{"comment":"错误码","type":"number","format":"int"}}},"storge_err":{"comment":"存储状态异常","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"}}},"gps_err":{"comment":"GPS不在指定GPS区域","args":{"time":{"comment":"错误发生时间戳","type":"number","format":"int"},"type":{"comment":"告警类型：1：短信通知设置的告警，2：DO输出设置的告警","type":"number","format":"int"},"longitude":{"comment":"经度","type":"number","format":"float"},"latitude":{"comment":"纬度","type":"number","format":"float"}}}},"logs":{"loginfo":{"comment":"日志信息","nickname":"日志信息","args":{"time":{"comment":"日志时间","nickname":"日志时间","type":"nubmer","format":"int"},"level":{"comment":"日志等级:0:日志信息, 1：告警, 2：错误","nickname":"日志等级","format":"int","type":"number"},"info":{"comment":"日志信息","nickname":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1,"num":-1},"options":{"unique":true}}},"node_gw_bydata":false,"online_type":0,"verifyid":"","data_size":0.01171875,"devices_size":0.08203125,"event_size":0.01171875,"index":0,"raw_handler":"inherit_from_basetype","devprotocol":0,"devclass":0,"dtype_secret":"","owner":"zlg001","created_time":1568874135,"devtypeid":"5d831e97b137e8d9929fb9cc","devices":{"count":1},"uri":"/v1/devices/devtype/candtu-200"}]
         */

        private String username;
        private String mobile;
        private int role;
        private int register_time;
        private int last_login_time;
        private int password_changed_time;
        private String register_ip;
        private String last_login_ip;
        private DevExtraBean dev_extra;
        private String status;
        private String language;
        private String nickname;
        private String avatar;
        private String desc;
        private String sysname;
        private String city;
        private String detailaddress;
        private String company;
        private int gender;
        private String email;
        private String userid;
        private String uri;
        private List<DeviceTypesBean> device_types;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getRole() {
            return role;
        }

        public void setRole(int role) {
            this.role = role;
        }

        public int getRegister_time() {
            return register_time;
        }

        public void setRegister_time(int register_time) {
            this.register_time = register_time;
        }

        public int getLast_login_time() {
            return last_login_time;
        }

        public void setLast_login_time(int last_login_time) {
            this.last_login_time = last_login_time;
        }

        public int getPassword_changed_time() {
            return password_changed_time;
        }

        public void setPassword_changed_time(int password_changed_time) {
            this.password_changed_time = password_changed_time;
        }

        public String getRegister_ip() {
            return register_ip;
        }

        public void setRegister_ip(String register_ip) {
            this.register_ip = register_ip;
        }

        public String getLast_login_ip() {
            return last_login_ip;
        }

        public void setLast_login_ip(String last_login_ip) {
            this.last_login_ip = last_login_ip;
        }

        public DevExtraBean getDev_extra() {
            return dev_extra;
        }

        public void setDev_extra(DevExtraBean dev_extra) {
            this.dev_extra = dev_extra;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getSysname() {
            return sysname;
        }

        public void setSysname(String sysname) {
            this.sysname = sysname;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDetailaddress() {
            return detailaddress;
        }

        public void setDetailaddress(String detailaddress) {
            this.detailaddress = detailaddress;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public List<DeviceTypesBean> getDevice_types() {
            return device_types;
        }

        public void setDevice_types(List<DeviceTypesBean> device_types) {
            this.device_types = device_types;
        }

        public static class DevExtraBean {
            /**
             * data_expire : 1
             * data_capacity : 2048
             * data_size : 20.4296875
             * update_time : 1570600802
             * devtype_capacity : 10
             * dev_capacity : 20
             */

            private int data_expire;
            private int data_capacity;
            private double data_size;
            private int update_time;
            private int devtype_capacity;
            private int dev_capacity;

            public int getData_expire() {
                return data_expire;
            }

            public void setData_expire(int data_expire) {
                this.data_expire = data_expire;
            }

            public int getData_capacity() {
                return data_capacity;
            }

            public void setData_capacity(int data_capacity) {
                this.data_capacity = data_capacity;
            }

            public double getData_size() {
                return data_size;
            }

            public void setData_size(double data_size) {
                this.data_size = data_size;
            }

            public int getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(int update_time) {
                this.update_time = update_time;
            }

            public int getDevtype_capacity() {
                return devtype_capacity;
            }

            public void setDevtype_capacity(int devtype_capacity) {
                this.devtype_capacity = devtype_capacity;
            }

            public int getDev_capacity() {
                return dev_capacity;
            }

            public void setDev_capacity(int dev_capacity) {
                this.dev_capacity = dev_capacity;
            }
        }

        public static class DeviceTypesBean {
            /**
             * devtype : zlg001_devtype_invert
             * basetype : invert
             * schema : {"memo":{"desc":{"comment":"一代机三相机","maxLength":1024,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}},"init_param":{},"data":{"test":{"nickname":"test","comment":"tes","unit":"","min":0,"max":0,"type":"number","format":"int"},"total_energy":{"comment":"总发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"总电量"},"today_energy":{"comment":"当天发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"今日发电量"},"temperature":{"comment":"逆变器温度","format":"float","type":"number","unit":"℃","min":0,"max":150,"nickname":"温度"},"gfci":{"comment":"对地漏电流","format":"float","type":"number","unit":"mA","min":0,"max":150},"bus_volt":{"comment":"BUS电压","format":"float","type":"number","unit":"V","min":0,"max":150,"nickname":"电压"},"power":{"comment":"逆变器输出有功功率","format":"float","type":"number","unit":"W","min":0,"max":6000,"nickname":"功率"},"q_power":{"comment":"逆变器输出无功功率","format":"float","type":"number","unit":"W","min":0,"max":1000},"pf":{"comment":"逆变器输出功率因数","format":"float","type":"number","unit":"","min":0,"max":1},"pv1_volt":{"comment":"直流输入电压pv1","format":"float","type":"number","unit":"V","min":0,"max":300},"pv1_curr":{"comment":"直流输入电流pv1","format":"float","type":"number","unit":"A","min":0,"max":20},"pv2_volt":{"comment":"直流输入电压pv2","format":"float","type":"number","unit":"V","min":0,"max":300},"pv2_curr":{"comment":"直流输入电流pv2","format":"float","type":"number","unit":"A","min":0,"max":20},"pv3_volt":{"comment":"直流输入电压pv3","format":"float","type":"number","unit":"V","min":0,"max":300},"pv3_curr":{"comment":"直流输入电流pv3","format":"float","type":"number","unit":"A","min":0,"max":20},"l1_volt":{"comment":"交流输出L1相电压","format":"float","type":"number","unit":"V","min":0,"max":300},"l1_curr":{"comment":"交流输出L1相电流","format":"float","type":"number","unit":"A","min":0,"max":220},"l1_freq":{"comment":"交流输出L1相频率","format":"float","type":"number","unit":"Hz","min":0,"max":400},"l1_dci":{"comment":"交流输出L1相直流分量","format":"float","type":"number","unit":"mA","min":0,"max":1000},"l1_power":{"comment":"交流输出L1相功率","format":"float","type":"number","unit":"W","min":0,"max":10000},"l1_pf":{"comment":"交流输出L1相功率因数","format":"float","type":"number","unit":"","min":0,"max":1}},"status":{"sw_ver1":{"comment":"software version1","min":0,"format":"float","type":"number"},"sw_ver2":{"comment":"software version2","min":0,"format":"float","type":"number"},"safety_spec":{"comment":"安规","min":0,"format":"float","type":"number"},"total_runtime":{"comment":"总运行时间","unit":"H","min":0,"format":"float","type":"number"},"today_runtime":{"comment":"当天运行时间","unit":"H","min":0,"format":"float","type":"number"},"clientip":{"comment":"client ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","type":"object","properties":{"version":{"comment":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","type":"string"},"version":{"comment":"新固件版本","type":"string"},"url":{"comment":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","type":"number","format":"int"}},"commands":{"set":{"comment":"set prop","cmdtype":true,"args":{"name":{"format":"name","type":"string"},"value":{"type":"string"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","cmdtype":true,"args":{"time":{"required":true,"type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据"}}}},"warnings":{"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}},"errors":{"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}},"logs":{"loginfo":{"comment":"日志信息","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}},"data_indexs":{"indexs":{"time":-1},"options":{}}}
             * node_gw_bydata : false
             * online_type : 0
             * verifyid :
             * data_size : 19.19140625
             * devices_size : 0.10546875
             * event_size : 0.08203125
             * index : 0
             * raw_handler : inherit_from_basetype
             * devprotocol : 0
             * devclass : 0
             * enable_secret : false
             * dtype_secret : f4204f80-ceed-11e9-a199-6f1bb8d247fd
             * owner : zlg001
             * created_time : 1567585700
             * devtypeid : 5d6f75a4d2de0bf92dec0084
             * devices : {"count":3}
             * uri : /v1/devices/devtype/zlg001_devtype_invert
             * comment : asdasdasdasdasdasddsasdasd
             * lora_deviceprofile_id : 2d2fac91-00ad-4417-b5f3-064e629a66bf
             */

            private String devtype;
            private String basetype;
            private SchemaBean schema;
            private boolean node_gw_bydata;
            private int online_type;
            private String verifyid;
            private double data_size;
            private double devices_size;
            private double event_size;
            private int index;
            private String raw_handler;
            private int devprotocol;
            private int devclass;
            private boolean enable_secret;
            private String dtype_secret;
            private String owner;
            private int created_time;
            private String devtypeid;
            private DevicesBean devices;
            private String uri;
            private String comment;
            private String lora_deviceprofile_id;

            public String getDevtype() {
                return devtype;
            }

            public void setDevtype(String devtype) {
                this.devtype = devtype;
            }

            public String getBasetype() {
                return basetype;
            }

            public void setBasetype(String basetype) {
                this.basetype = basetype;
            }

            public SchemaBean getSchema() {
                return schema;
            }

            public void setSchema(SchemaBean schema) {
                this.schema = schema;
            }

            public boolean isNode_gw_bydata() {
                return node_gw_bydata;
            }

            public void setNode_gw_bydata(boolean node_gw_bydata) {
                this.node_gw_bydata = node_gw_bydata;
            }

            public int getOnline_type() {
                return online_type;
            }

            public void setOnline_type(int online_type) {
                this.online_type = online_type;
            }

            public String getVerifyid() {
                return verifyid;
            }

            public void setVerifyid(String verifyid) {
                this.verifyid = verifyid;
            }

            public double getData_size() {
                return data_size;
            }

            public void setData_size(double data_size) {
                this.data_size = data_size;
            }

            public double getDevices_size() {
                return devices_size;
            }

            public void setDevices_size(double devices_size) {
                this.devices_size = devices_size;
            }

            public double getEvent_size() {
                return event_size;
            }

            public void setEvent_size(double event_size) {
                this.event_size = event_size;
            }

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public String getRaw_handler() {
                return raw_handler;
            }

            public void setRaw_handler(String raw_handler) {
                this.raw_handler = raw_handler;
            }

            public int getDevprotocol() {
                return devprotocol;
            }

            public void setDevprotocol(int devprotocol) {
                this.devprotocol = devprotocol;
            }

            public int getDevclass() {
                return devclass;
            }

            public void setDevclass(int devclass) {
                this.devclass = devclass;
            }

            public boolean isEnable_secret() {
                return enable_secret;
            }

            public void setEnable_secret(boolean enable_secret) {
                this.enable_secret = enable_secret;
            }

            public String getDtype_secret() {
                return dtype_secret;
            }

            public void setDtype_secret(String dtype_secret) {
                this.dtype_secret = dtype_secret;
            }

            public String getOwner() {
                return owner;
            }

            public void setOwner(String owner) {
                this.owner = owner;
            }

            public int getCreated_time() {
                return created_time;
            }

            public void setCreated_time(int created_time) {
                this.created_time = created_time;
            }

            public String getDevtypeid() {
                return devtypeid;
            }

            public void setDevtypeid(String devtypeid) {
                this.devtypeid = devtypeid;
            }

            public DevicesBean getDevices() {
                return devices;
            }

            public void setDevices(DevicesBean devices) {
                this.devices = devices;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }

            public String getLora_deviceprofile_id() {
                return lora_deviceprofile_id;
            }

            public void setLora_deviceprofile_id(String lora_deviceprofile_id) {
                this.lora_deviceprofile_id = lora_deviceprofile_id;
            }

            public static class SchemaBean {
                /**
                 * memo : {"desc":{"comment":"一代机三相机","maxLength":1024,"type":"string"},"devclass":{"type":"number","enums":[0,1,2,3],"min":0,"max":0,"autoGen":true,"readonly":true,"comment":"设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点"},"devid":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备id，2-64位字母、数字、连接号、下划线的组合"},"devtype":{"type":"string","readonly":true,"required":true,"minLength":2,"maxLength":32,"comment":"设备类型，2-64位字母、数字、连接号、下划线的组合"},"devsecret":{"type":"string","autoGen":true,"comment":"设备密钥，32位的uuid，用于设备登录auth服务器"},"devprotocol":{"type":"number","enums":[0,1],"autoGen":true,"readonly":true,"comment":"通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)"},"devname":{"comment":"设备名称","maxLength":256,"type":"string"},"country":{"comment":"设备所在国家","maxLength":64,"type":"string"},"region":{"comment":"设备所在省份","maxLength":64,"type":"string"},"city":{"comment":"设备所在市县","maxLength":64,"type":"string"},"status":{"type":"number","enums":[0,1,2,3,4,5,6],"userReadonly":true,"comment":"设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)"},"favorite":{"type":"number","enums":[0,1],"comment":"收藏：没有收藏(0)，收藏(1)"},"enable":{"type":"number","enums":[0,1],"userReadonly":true,"comment":"可用性：禁用(0)，可用(1)"},"devgroup":{"type":"string","maxLength":24,"readonly":true,"comment":"设备所在的设备分组的groupid;设备只能属于一个分组"},"subdevs":{"type":"array","comment":"子设备列表(只适用于devclass是网关的设备)","readonly":true,"items":[{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]},"gateway":{"type":"object","comment":"子设备对应的网关设备(只适用于子设备)","readonly":true,"properties":{"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}},"gps":{"type":"object","comment":"gps定位。","properties":{"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"data_extra":{"type":"object","comment":"数据硬盘统计","autoGen":true,"userReadonly":true,"properties":{"date_size":{"type":"number","format":"int","comment":"数据、事件硬盘占用空间"},"update_time":{"type":"number","format":"int","comment":"data_size最后更新时间 单位(s)"}}}}
                 * init_param : {}
                 * data : {"test":{"nickname":"test","comment":"tes","unit":"","min":0,"max":0,"type":"number","format":"int"},"total_energy":{"comment":"总发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"总电量"},"today_energy":{"comment":"当天发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"今日发电量"},"temperature":{"comment":"逆变器温度","format":"float","type":"number","unit":"℃","min":0,"max":150,"nickname":"温度"},"gfci":{"comment":"对地漏电流","format":"float","type":"number","unit":"mA","min":0,"max":150},"bus_volt":{"comment":"BUS电压","format":"float","type":"number","unit":"V","min":0,"max":150,"nickname":"电压"},"power":{"comment":"逆变器输出有功功率","format":"float","type":"number","unit":"W","min":0,"max":6000,"nickname":"功率"},"q_power":{"comment":"逆变器输出无功功率","format":"float","type":"number","unit":"W","min":0,"max":1000},"pf":{"comment":"逆变器输出功率因数","format":"float","type":"number","unit":"","min":0,"max":1},"pv1_volt":{"comment":"直流输入电压pv1","format":"float","type":"number","unit":"V","min":0,"max":300},"pv1_curr":{"comment":"直流输入电流pv1","format":"float","type":"number","unit":"A","min":0,"max":20},"pv2_volt":{"comment":"直流输入电压pv2","format":"float","type":"number","unit":"V","min":0,"max":300},"pv2_curr":{"comment":"直流输入电流pv2","format":"float","type":"number","unit":"A","min":0,"max":20},"pv3_volt":{"comment":"直流输入电压pv3","format":"float","type":"number","unit":"V","min":0,"max":300},"pv3_curr":{"comment":"直流输入电流pv3","format":"float","type":"number","unit":"A","min":0,"max":20},"l1_volt":{"comment":"交流输出L1相电压","format":"float","type":"number","unit":"V","min":0,"max":300},"l1_curr":{"comment":"交流输出L1相电流","format":"float","type":"number","unit":"A","min":0,"max":220},"l1_freq":{"comment":"交流输出L1相频率","format":"float","type":"number","unit":"Hz","min":0,"max":400},"l1_dci":{"comment":"交流输出L1相直流分量","format":"float","type":"number","unit":"mA","min":0,"max":1000},"l1_power":{"comment":"交流输出L1相功率","format":"float","type":"number","unit":"W","min":0,"max":10000},"l1_pf":{"comment":"交流输出L1相功率因数","format":"float","type":"number","unit":"","min":0,"max":1}}
                 * status : {"sw_ver1":{"comment":"software version1","min":0,"format":"float","type":"number"},"sw_ver2":{"comment":"software version2","min":0,"format":"float","type":"number"},"safety_spec":{"comment":"安规","min":0,"format":"float","type":"number"},"total_runtime":{"comment":"总运行时间","unit":"H","min":0,"format":"float","type":"number"},"today_runtime":{"comment":"当天运行时间","unit":"H","min":0,"format":"float","type":"number"},"clientip":{"comment":"client ip","type":"string","maxLength":32},"currentfm":{"comment":"设备当前固件的信息","type":"object","properties":{"version":{"comment":"当前固件版本","type":"string","required":true}}},"newfm":{"comment":"待升级固件的信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","type":"string"},"version":{"comment":"新固件版本","type":"string"},"url":{"comment":"新固件地址","type":"string"}}},"gps":{"type":"object","comment":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}},"fault":{"comment":"fault","type":"number","format":"int"}}
                 * commands : {"set":{"comment":"set prop","cmdtype":true,"args":{"name":{"format":"name","type":"string"},"value":{"type":"string"}}},"set_config":{"comment":"配置设备参数，与具体的设备有关","cmdtype":true,"args":{}},"sync_time":{"comment":"同步时间","cmdtype":true,"args":{"time":{"required":true,"type":"number"}}},"notify_upgrade":{"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"exec_upgrade":{"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}},"req_report":{"comment":"要求设备上报最新数据。","cmdtype":true,"args":{}},"pass_through":{"comment":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据"}}}}
                 * warnings : {"temperature_high":{"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}}
                 * errors : {"temperature_too_high":{"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}}
                 * logs : {"loginfo":{"comment":"日志信息","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}}
                 * data_indexs : {"indexs":{"time":-1},"options":{}}
                 */

                private MemoBean memo;
                private InitParamBean init_param;
                private DataBean data;
                private StatusBeanX status;
                private CommandsBean commands;
                private WarningsBean warnings;
                private ErrorsBean errors;
                private LogsBean logs;
                private DataIndexsBean data_indexs;

                public MemoBean getMemo() {
                    return memo;
                }

                public void setMemo(MemoBean memo) {
                    this.memo = memo;
                }

                public InitParamBean getInit_param() {
                    return init_param;
                }

                public void setInit_param(InitParamBean init_param) {
                    this.init_param = init_param;
                }

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public StatusBeanX getStatus() {
                    return status;
                }

                public void setStatus(StatusBeanX status) {
                    this.status = status;
                }

                public CommandsBean getCommands() {
                    return commands;
                }

                public void setCommands(CommandsBean commands) {
                    this.commands = commands;
                }

                public WarningsBean getWarnings() {
                    return warnings;
                }

                public void setWarnings(WarningsBean warnings) {
                    this.warnings = warnings;
                }

                public ErrorsBean getErrors() {
                    return errors;
                }

                public void setErrors(ErrorsBean errors) {
                    this.errors = errors;
                }

                public LogsBean getLogs() {
                    return logs;
                }

                public void setLogs(LogsBean logs) {
                    this.logs = logs;
                }

                public DataIndexsBean getData_indexs() {
                    return data_indexs;
                }

                public void setData_indexs(DataIndexsBean data_indexs) {
                    this.data_indexs = data_indexs;
                }

                public static class MemoBean {
                    public static class DescBean {
                        /**
                         * comment : 一代机三相机
                         * maxLength : 1024
                         * type : string
                         */

                        private String comment;
                        private int maxLength;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class DevclassBean {
                        /**
                         * type : number
                         * enums : [0,1,2,3]
                         * min : 0
                         * max : 0
                         * autoGen : true
                         * readonly : true
                         * comment : 设备分类，包括默认设备(0)，通用网关(1)，LoraWan节点(2),LoraWan网关(3);此处必须为2，即LoraWan节点
                         */

                        private String type;
                        private int min;
                        private int max;
                        private boolean autoGen;
                        private boolean readonly;
                        private String comment;
                        private List<Integer> enums;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }

                        public boolean isAutoGen() {
                            return autoGen;
                        }

                        public void setAutoGen(boolean autoGen) {
                            this.autoGen = autoGen;
                        }

                        public boolean isReadonly() {
                            return readonly;
                        }

                        public void setReadonly(boolean readonly) {
                            this.readonly = readonly;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public List<Integer> getEnums() {
                            return enums;
                        }

                        public void setEnums(List<Integer> enums) {
                            this.enums = enums;
                        }
                    }

                    public static class DevidBean {
                        /**
                         * type : string
                         * readonly : true
                         * required : true
                         * minLength : 2
                         * maxLength : 32
                         * comment : 设备id，2-64位字母、数字、连接号、下划线的组合
                         */

                        private String type;
                        private boolean readonly;
                        private boolean required;
                        private int minLength;
                        private int maxLength;
                        private String comment;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public boolean isReadonly() {
                            return readonly;
                        }

                        public void setReadonly(boolean readonly) {
                            this.readonly = readonly;
                        }

                        public boolean isRequired() {
                            return required;
                        }

                        public void setRequired(boolean required) {
                            this.required = required;
                        }

                        public int getMinLength() {
                            return minLength;
                        }

                        public void setMinLength(int minLength) {
                            this.minLength = minLength;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }
                    }

                    public static class DevtypeBean {
                        /**
                         * type : string
                         * readonly : true
                         * required : true
                         * minLength : 2
                         * maxLength : 32
                         * comment : 设备类型，2-64位字母、数字、连接号、下划线的组合
                         */

                        private String type;
                        private boolean readonly;
                        private boolean required;
                        private int minLength;
                        private int maxLength;
                        private String comment;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public boolean isReadonly() {
                            return readonly;
                        }

                        public void setReadonly(boolean readonly) {
                            this.readonly = readonly;
                        }

                        public boolean isRequired() {
                            return required;
                        }

                        public void setRequired(boolean required) {
                            this.required = required;
                        }

                        public int getMinLength() {
                            return minLength;
                        }

                        public void setMinLength(int minLength) {
                            this.minLength = minLength;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }
                    }

                    public static class DevsecretBean {
                        /**
                         * type : string
                         * autoGen : true
                         * comment : 设备密钥，32位的uuid，用于设备登录auth服务器
                         */

                        private String type;
                        private boolean autoGen;
                        private String comment;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public boolean isAutoGen() {
                            return autoGen;
                        }

                        public void setAutoGen(boolean autoGen) {
                            this.autoGen = autoGen;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }
                    }

                    public static class DevprotocolBean {
                        /**
                         * type : number
                         * enums : [0,1]
                         * autoGen : true
                         * readonly : true
                         * comment : 通信协议(同时对应了解析数据的协议)，包括默认协议(0)，Modbus(1);该字段为空时，为默认协议(即mqtt协议)
                         */

                        private String type;
                        private boolean autoGen;
                        private boolean readonly;
                        private String comment;
                        private List<Integer> enums;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public boolean isAutoGen() {
                            return autoGen;
                        }

                        public void setAutoGen(boolean autoGen) {
                            this.autoGen = autoGen;
                        }

                        public boolean isReadonly() {
                            return readonly;
                        }

                        public void setReadonly(boolean readonly) {
                            this.readonly = readonly;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public List<Integer> getEnums() {
                            return enums;
                        }

                        public void setEnums(List<Integer> enums) {
                            this.enums = enums;
                        }
                    }

                    public static class DevnameBean {
                        /**
                         * comment : 设备名称
                         * maxLength : 256
                         * type : string
                         */

                        private String comment;
                        private int maxLength;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class CountryBean {
                        /**
                         * comment : 设备所在国家
                         * maxLength : 64
                         * type : string
                         */

                        private String comment;
                        private int maxLength;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class RegionBean {
                        /**
                         * comment : 设备所在省份
                         * maxLength : 64
                         * type : string
                         */

                        private String comment;
                        private int maxLength;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class CityBean {
                        /**
                         * comment : 设备所在市县
                         * maxLength : 64
                         * type : string
                         */

                        private String comment;
                        private int maxLength;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class StatusBean {
                        /**
                         * type : number
                         * enums : [0,1,2,3,4,5,6]
                         * userReadonly : true
                         * comment : 设备状态标志：online(0)，offline(1)，fault(2)，standby(3)，warning(4)，error(5)，protocol_error(6)
                         */

                        private String type;
                        private boolean userReadonly;
                        private String comment;
                        private List<Integer> enums;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public boolean isUserReadonly() {
                            return userReadonly;
                        }

                        public void setUserReadonly(boolean userReadonly) {
                            this.userReadonly = userReadonly;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public List<Integer> getEnums() {
                            return enums;
                        }

                        public void setEnums(List<Integer> enums) {
                            this.enums = enums;
                        }
                    }

                    public static class FavoriteBean {
                        /**
                         * type : number
                         * enums : [0,1]
                         * comment : 收藏：没有收藏(0)，收藏(1)
                         */

                        private String type;
                        private String comment;
                        private List<Integer> enums;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public List<Integer> getEnums() {
                            return enums;
                        }

                        public void setEnums(List<Integer> enums) {
                            this.enums = enums;
                        }
                    }

                    public static class EnableBean {
                        /**
                         * type : number
                         * enums : [0,1]
                         * userReadonly : true
                         * comment : 可用性：禁用(0)，可用(1)
                         */

                        private String type;
                        private boolean userReadonly;
                        private String comment;
                        private List<Integer> enums;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public boolean isUserReadonly() {
                            return userReadonly;
                        }

                        public void setUserReadonly(boolean userReadonly) {
                            this.userReadonly = userReadonly;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public List<Integer> getEnums() {
                            return enums;
                        }

                        public void setEnums(List<Integer> enums) {
                            this.enums = enums;
                        }
                    }

                    public static class DevgroupBean {
                        /**
                         * type : string
                         * maxLength : 24
                         * readonly : true
                         * comment : 设备所在的设备分组的groupid;设备只能属于一个分组
                         */

                        private String type;
                        private int maxLength;
                        private boolean readonly;
                        private String comment;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }

                        public boolean isReadonly() {
                            return readonly;
                        }

                        public void setReadonly(boolean readonly) {
                            this.readonly = readonly;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }
                    }

                    public static class SubdevsBean {
                        /**
                         * type : array
                         * comment : 子设备列表(只适用于devclass是网关的设备)
                         * readonly : true
                         * items : [{"type":"object","properties":{"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}}]
                         */

                        private String type;
                        private String comment;
                        private boolean readonly;
                        private List<ItemsBean> items;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isReadonly() {
                            return readonly;
                        }

                        public void setReadonly(boolean readonly) {
                            this.readonly = readonly;
                        }

                        public List<ItemsBean> getItems() {
                            return items;
                        }

                        public void setItems(List<ItemsBean> items) {
                            this.items = items;
                        }

                        public static class ItemsBean {
                            /**
                             * type : object
                             * properties : {"devtype":{"type":"string","comment":"设备类型"},"devid":{"type":"string","comment":"设备ID"}}
                             */

                            private String type;
                            private PropertiesBean properties;

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }

                            public PropertiesBean getProperties() {
                                return properties;
                            }

                            public void setProperties(PropertiesBean properties) {
                                this.properties = properties;
                            }

                            public static class PropertiesBean {
                                /**
                                 * devtype : {"type":"string","comment":"设备类型"}
                                 * devid : {"type":"string","comment":"设备ID"}
                                 */

                                private DevtypeBeanX devtype;
                                private DevidBeanX devid;

                                public DevtypeBeanX getDevtype() {
                                    return devtype;
                                }

                                public void setDevtype(DevtypeBeanX devtype) {
                                    this.devtype = devtype;
                                }

                                public DevidBeanX getDevid() {
                                    return devid;
                                }

                                public void setDevid(DevidBeanX devid) {
                                    this.devid = devid;
                                }

                                public static class DevtypeBeanX {
                                    /**
                                     * type : string
                                     * comment : 设备类型
                                     */

                                    private String type;
                                    private String comment;

                                    public String getType() {
                                        return type;
                                    }

                                    public void setType(String type) {
                                        this.type = type;
                                    }

                                    public String getComment() {
                                        return comment;
                                    }

                                    public void setComment(String comment) {
                                        this.comment = comment;
                                    }
                                }

                                public static class DevidBeanX {
                                    /**
                                     * type : string
                                     * comment : 设备ID
                                     */

                                    private String type;
                                    private String comment;

                                    public String getType() {
                                        return type;
                                    }

                                    public void setType(String type) {
                                        this.type = type;
                                    }

                                    public String getComment() {
                                        return comment;
                                    }

                                    public void setComment(String comment) {
                                        this.comment = comment;
                                    }
                                }
                            }
                        }
                    }

                    public static class GatewayBean {
                        /**
                         * type : object
                         * comment : 子设备对应的网关设备(只适用于子设备)
                         * readonly : true
                         * properties : {"devtype":{"type":"string","comment":"父设备的devtype"},"devid":{"type":"string","comment":"父设备的devid"}}
                         */

                        private String type;
                        private String comment;
                        private boolean readonly;
                        private PropertiesBeanX properties;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isReadonly() {
                            return readonly;
                        }

                        public void setReadonly(boolean readonly) {
                            this.readonly = readonly;
                        }

                        public PropertiesBeanX getProperties() {
                            return properties;
                        }

                        public void setProperties(PropertiesBeanX properties) {
                            this.properties = properties;
                        }

                        public static class PropertiesBeanX {
                            /**
                             * devtype : {"type":"string","comment":"父设备的devtype"}
                             * devid : {"type":"string","comment":"父设备的devid"}
                             */

                            private DevtypeBeanXX devtype;
                            private DevidBeanXX devid;

                            public DevtypeBeanXX getDevtype() {
                                return devtype;
                            }

                            public void setDevtype(DevtypeBeanXX devtype) {
                                this.devtype = devtype;
                            }

                            public DevidBeanXX getDevid() {
                                return devid;
                            }

                            public void setDevid(DevidBeanXX devid) {
                                this.devid = devid;
                            }

                            public static class DevtypeBeanXX {
                                /**
                                 * type : string
                                 * comment : 父设备的devtype
                                 */

                                private String type;
                                private String comment;

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }
                            }

                            public static class DevidBeanXX {
                                /**
                                 * type : string
                                 * comment : 父设备的devid
                                 */

                                private String type;
                                private String comment;

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }
                            }
                        }
                    }

                    public static class GpsBean {
                        /**
                         * type : object
                         * comment : gps定位。
                         * properties : {"latitude":{"type":"number","format":"float","comment":"经度。"},"longitude":{"type":"number","format":"float","comment":"纬度。"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}
                         */

                        private String type;
                        private String comment;
                        private PropertiesBeanXX properties;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public PropertiesBeanXX getProperties() {
                            return properties;
                        }

                        public void setProperties(PropertiesBeanXX properties) {
                            this.properties = properties;
                        }

                        public static class PropertiesBeanXX {
                            /**
                             * latitude : {"type":"number","format":"float","comment":"经度。"}
                             * longitude : {"type":"number","format":"float","comment":"纬度。"}
                             * GPSTime : {"comment":"GPS信息时间戳","type":"number","format":"int"}
                             */

                            private LatitudeBean latitude;
                            private LongitudeBean longitude;
                            private GPSTimeBean GPSTime;

                            public LatitudeBean getLatitude() {
                                return latitude;
                            }

                            public void setLatitude(LatitudeBean latitude) {
                                this.latitude = latitude;
                            }

                            public LongitudeBean getLongitude() {
                                return longitude;
                            }

                            public void setLongitude(LongitudeBean longitude) {
                                this.longitude = longitude;
                            }

                            public GPSTimeBean getGPSTime() {
                                return GPSTime;
                            }

                            public void setGPSTime(GPSTimeBean GPSTime) {
                                this.GPSTime = GPSTime;
                            }

                            public static class LatitudeBean {
                                /**
                                 * type : number
                                 * format : float
                                 * comment : 经度。
                                 */

                                private String type;
                                private String format;
                                private String comment;

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }
                            }

                            public static class LongitudeBean {
                                /**
                                 * type : number
                                 * format : float
                                 * comment : 纬度。
                                 */

                                private String type;
                                private String format;
                                private String comment;

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }
                            }

                            public static class GPSTimeBean {
                                /**
                                 * comment : GPS信息时间戳
                                 * type : number
                                 * format : int
                                 */

                                private String comment;
                                private String type;
                                private String format;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }
                            }
                        }
                    }

                    public static class DataExtraBean {
                        public static class PropertiesBeanXXX {
                            public static class DateSizeBean {
                                /**
                                 * type : number
                                 * format : int
                                 * comment : 数据、事件硬盘占用空间
                                 */

                                private String type;
                                private String format;
                                private String comment;

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }
                            }

                            public static class UpdateTimeBean {
                            }
                        }
                    }
                }

                public static class InitParamBean {
                }

                public static class DataBean {
                    /**
                     * test : {"nickname":"test","comment":"tes","unit":"","min":0,"max":0,"type":"number","format":"int"}
                     * total_energy : {"comment":"总发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"总电量"}
                     * today_energy : {"comment":"当天发电量","unit":"kWh","min":0,"format":"float","type":"number","nickname":"今日发电量"}
                     * temperature : {"comment":"逆变器温度","format":"float","type":"number","unit":"℃","min":0,"max":150,"nickname":"温度"}
                     * gfci : {"comment":"对地漏电流","format":"float","type":"number","unit":"mA","min":0,"max":150}
                     * bus_volt : {"comment":"BUS电压","format":"float","type":"number","unit":"V","min":0,"max":150,"nickname":"电压"}
                     * power : {"comment":"逆变器输出有功功率","format":"float","type":"number","unit":"W","min":0,"max":6000,"nickname":"功率"}
                     * q_power : {"comment":"逆变器输出无功功率","format":"float","type":"number","unit":"W","min":0,"max":1000}
                     * pf : {"comment":"逆变器输出功率因数","format":"float","type":"number","unit":"","min":0,"max":1}
                     * pv1_volt : {"comment":"直流输入电压pv1","format":"float","type":"number","unit":"V","min":0,"max":300}
                     * pv1_curr : {"comment":"直流输入电流pv1","format":"float","type":"number","unit":"A","min":0,"max":20}
                     * pv2_volt : {"comment":"直流输入电压pv2","format":"float","type":"number","unit":"V","min":0,"max":300}
                     * pv2_curr : {"comment":"直流输入电流pv2","format":"float","type":"number","unit":"A","min":0,"max":20}
                     * pv3_volt : {"comment":"直流输入电压pv3","format":"float","type":"number","unit":"V","min":0,"max":300}
                     * pv3_curr : {"comment":"直流输入电流pv3","format":"float","type":"number","unit":"A","min":0,"max":20}
                     * l1_volt : {"comment":"交流输出L1相电压","format":"float","type":"number","unit":"V","min":0,"max":300}
                     * l1_curr : {"comment":"交流输出L1相电流","format":"float","type":"number","unit":"A","min":0,"max":220}
                     * l1_freq : {"comment":"交流输出L1相频率","format":"float","type":"number","unit":"Hz","min":0,"max":400}
                     * l1_dci : {"comment":"交流输出L1相直流分量","format":"float","type":"number","unit":"mA","min":0,"max":1000}
                     * l1_power : {"comment":"交流输出L1相功率","format":"float","type":"number","unit":"W","min":0,"max":10000}
                     * l1_pf : {"comment":"交流输出L1相功率因数","format":"float","type":"number","unit":"","min":0,"max":1}
                     */

                    private TestBean test;
                    private TotalEnergyBean total_energy;
                    private TodayEnergyBean today_energy;
                    private TemperatureBean temperature;
                    private GfciBean gfci;
                    private BusVoltBean bus_volt;
                    private PowerBean power;
                    private QPowerBean q_power;
                    private PfBean pf;
                    private Pv1VoltBean pv1_volt;
                    private Pv1CurrBean pv1_curr;
                    private Pv2VoltBean pv2_volt;
                    private Pv2CurrBean pv2_curr;
                    private Pv3VoltBean pv3_volt;
                    private Pv3CurrBean pv3_curr;
                    private L1VoltBean l1_volt;
                    private L1CurrBean l1_curr;
                    private L1FreqBean l1_freq;
                    private L1DciBean l1_dci;
                    private L1PowerBean l1_power;
                    private L1PfBean l1_pf;

                    public TestBean getTest() {
                        return test;
                    }

                    public void setTest(TestBean test) {
                        this.test = test;
                    }

                    public TotalEnergyBean getTotal_energy() {
                        return total_energy;
                    }

                    public void setTotal_energy(TotalEnergyBean total_energy) {
                        this.total_energy = total_energy;
                    }

                    public TodayEnergyBean getToday_energy() {
                        return today_energy;
                    }

                    public void setToday_energy(TodayEnergyBean today_energy) {
                        this.today_energy = today_energy;
                    }

                    public TemperatureBean getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(TemperatureBean temperature) {
                        this.temperature = temperature;
                    }

                    public GfciBean getGfci() {
                        return gfci;
                    }

                    public void setGfci(GfciBean gfci) {
                        this.gfci = gfci;
                    }

                    public BusVoltBean getBus_volt() {
                        return bus_volt;
                    }

                    public void setBus_volt(BusVoltBean bus_volt) {
                        this.bus_volt = bus_volt;
                    }

                    public PowerBean getPower() {
                        return power;
                    }

                    public void setPower(PowerBean power) {
                        this.power = power;
                    }

                    public QPowerBean getQ_power() {
                        return q_power;
                    }

                    public void setQ_power(QPowerBean q_power) {
                        this.q_power = q_power;
                    }

                    public PfBean getPf() {
                        return pf;
                    }

                    public void setPf(PfBean pf) {
                        this.pf = pf;
                    }

                    public Pv1VoltBean getPv1_volt() {
                        return pv1_volt;
                    }

                    public void setPv1_volt(Pv1VoltBean pv1_volt) {
                        this.pv1_volt = pv1_volt;
                    }

                    public Pv1CurrBean getPv1_curr() {
                        return pv1_curr;
                    }

                    public void setPv1_curr(Pv1CurrBean pv1_curr) {
                        this.pv1_curr = pv1_curr;
                    }

                    public Pv2VoltBean getPv2_volt() {
                        return pv2_volt;
                    }

                    public void setPv2_volt(Pv2VoltBean pv2_volt) {
                        this.pv2_volt = pv2_volt;
                    }

                    public Pv2CurrBean getPv2_curr() {
                        return pv2_curr;
                    }

                    public void setPv2_curr(Pv2CurrBean pv2_curr) {
                        this.pv2_curr = pv2_curr;
                    }

                    public Pv3VoltBean getPv3_volt() {
                        return pv3_volt;
                    }

                    public void setPv3_volt(Pv3VoltBean pv3_volt) {
                        this.pv3_volt = pv3_volt;
                    }

                    public Pv3CurrBean getPv3_curr() {
                        return pv3_curr;
                    }

                    public void setPv3_curr(Pv3CurrBean pv3_curr) {
                        this.pv3_curr = pv3_curr;
                    }

                    public L1VoltBean getL1_volt() {
                        return l1_volt;
                    }

                    public void setL1_volt(L1VoltBean l1_volt) {
                        this.l1_volt = l1_volt;
                    }

                    public L1CurrBean getL1_curr() {
                        return l1_curr;
                    }

                    public void setL1_curr(L1CurrBean l1_curr) {
                        this.l1_curr = l1_curr;
                    }

                    public L1FreqBean getL1_freq() {
                        return l1_freq;
                    }

                    public void setL1_freq(L1FreqBean l1_freq) {
                        this.l1_freq = l1_freq;
                    }

                    public L1DciBean getL1_dci() {
                        return l1_dci;
                    }

                    public void setL1_dci(L1DciBean l1_dci) {
                        this.l1_dci = l1_dci;
                    }

                    public L1PowerBean getL1_power() {
                        return l1_power;
                    }

                    public void setL1_power(L1PowerBean l1_power) {
                        this.l1_power = l1_power;
                    }

                    public L1PfBean getL1_pf() {
                        return l1_pf;
                    }

                    public void setL1_pf(L1PfBean l1_pf) {
                        this.l1_pf = l1_pf;
                    }

                    public static class TestBean {
                        /**
                         * nickname : test
                         * comment : tes
                         * unit :
                         * min : 0
                         * max : 0
                         * type : number
                         * format : int
                         */

                        private String nickname;
                        private String comment;
                        private String unit;
                        private int min;
                        private int max;
                        private String type;
                        private String format;

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }
                    }

                    public static class TotalEnergyBean {
                        /**
                         * comment : 总发电量
                         * unit : kWh
                         * min : 0
                         * format : float
                         * type : number
                         * nickname : 总电量
                         */

                        private String comment;
                        private String unit;
                        private int min;
                        private String format;
                        private String type;
                        private String nickname;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }
                    }

                    public static class TodayEnergyBean {
                        /**
                         * comment : 当天发电量
                         * unit : kWh
                         * min : 0
                         * format : float
                         * type : number
                         * nickname : 今日发电量
                         */

                        private String comment;
                        private String unit;
                        private int min;
                        private String format;
                        private String type;
                        private String nickname;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }
                    }

                    public static class TemperatureBean {
                        /**
                         * comment : 逆变器温度
                         * format : float
                         * type : number
                         * unit : ℃
                         * min : 0
                         * max : 150
                         * nickname : 温度
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;
                        private String nickname;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }
                    }

                    public static class GfciBean {
                        /**
                         * comment : 对地漏电流
                         * format : float
                         * type : number
                         * unit : mA
                         * min : 0
                         * max : 150
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class BusVoltBean {
                        /**
                         * comment : BUS电压
                         * format : float
                         * type : number
                         * unit : V
                         * min : 0
                         * max : 150
                         * nickname : 电压
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;
                        private String nickname;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }
                    }

                    public static class PowerBean {
                        /**
                         * comment : 逆变器输出有功功率
                         * format : float
                         * type : number
                         * unit : W
                         * min : 0
                         * max : 6000
                         * nickname : 功率
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;
                        private String nickname;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }
                    }

                    public static class QPowerBean {
                        /**
                         * comment : 逆变器输出无功功率
                         * format : float
                         * type : number
                         * unit : W
                         * min : 0
                         * max : 1000
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class PfBean {
                        /**
                         * comment : 逆变器输出功率因数
                         * format : float
                         * type : number
                         * unit :
                         * min : 0
                         * max : 1
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class Pv1VoltBean {
                        /**
                         * comment : 直流输入电压pv1
                         * format : float
                         * type : number
                         * unit : V
                         * min : 0
                         * max : 300
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class Pv1CurrBean {
                        /**
                         * comment : 直流输入电流pv1
                         * format : float
                         * type : number
                         * unit : A
                         * min : 0
                         * max : 20
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class Pv2VoltBean {
                        /**
                         * comment : 直流输入电压pv2
                         * format : float
                         * type : number
                         * unit : V
                         * min : 0
                         * max : 300
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class Pv2CurrBean {
                        /**
                         * comment : 直流输入电流pv2
                         * format : float
                         * type : number
                         * unit : A
                         * min : 0
                         * max : 20
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class Pv3VoltBean {
                        /**
                         * comment : 直流输入电压pv3
                         * format : float
                         * type : number
                         * unit : V
                         * min : 0
                         * max : 300
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class Pv3CurrBean {
                        /**
                         * comment : 直流输入电流pv3
                         * format : float
                         * type : number
                         * unit : A
                         * min : 0
                         * max : 20
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class L1VoltBean {
                        /**
                         * comment : 交流输出L1相电压
                         * format : float
                         * type : number
                         * unit : V
                         * min : 0
                         * max : 300
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class L1CurrBean {
                        /**
                         * comment : 交流输出L1相电流
                         * format : float
                         * type : number
                         * unit : A
                         * min : 0
                         * max : 220
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class L1FreqBean {
                        /**
                         * comment : 交流输出L1相频率
                         * format : float
                         * type : number
                         * unit : Hz
                         * min : 0
                         * max : 400
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class L1DciBean {
                        /**
                         * comment : 交流输出L1相直流分量
                         * format : float
                         * type : number
                         * unit : mA
                         * min : 0
                         * max : 1000
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class L1PowerBean {
                        /**
                         * comment : 交流输出L1相功率
                         * format : float
                         * type : number
                         * unit : W
                         * min : 0
                         * max : 10000
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }

                    public static class L1PfBean {
                        /**
                         * comment : 交流输出L1相功率因数
                         * format : float
                         * type : number
                         * unit :
                         * min : 0
                         * max : 1
                         */

                        private String comment;
                        private String format;
                        private String type;
                        private String unit;
                        private int min;
                        private int max;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public int getMax() {
                            return max;
                        }

                        public void setMax(int max) {
                            this.max = max;
                        }
                    }
                }

                public static class StatusBeanX {
                    /**
                     * sw_ver1 : {"comment":"software version1","min":0,"format":"float","type":"number"}
                     * sw_ver2 : {"comment":"software version2","min":0,"format":"float","type":"number"}
                     * safety_spec : {"comment":"安规","min":0,"format":"float","type":"number"}
                     * total_runtime : {"comment":"总运行时间","unit":"H","min":0,"format":"float","type":"number"}
                     * today_runtime : {"comment":"当天运行时间","unit":"H","min":0,"format":"float","type":"number"}
                     * clientip : {"comment":"client ip","type":"string","maxLength":32}
                     * currentfm : {"comment":"设备当前固件的信息","type":"object","properties":{"version":{"comment":"当前固件版本","type":"string","required":true}}}
                     * newfm : {"comment":"待升级固件的信息","type":"object","properties":{"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","type":"string"},"version":{"comment":"新固件版本","type":"string"},"url":{"comment":"新固件地址","type":"string"}}}
                     * gps : {"type":"object","comment":"gps定位","properties":{"latitude":{"type":"number","format":"float","comment":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}}
                     * fault : {"comment":"fault","type":"number","format":"int"}
                     */

                    private SwVer1Bean sw_ver1;
                    private SwVer2Bean sw_ver2;
                    private SafetySpecBean safety_spec;
                    private TotalRuntimeBean total_runtime;
                    private TodayRuntimeBean today_runtime;
                    private ClientipBean clientip;
                    private CurrentfmBean currentfm;
                    private NewfmBean newfm;
                    private GpsBeanX gps;
                    private FaultBean fault;

                    public SwVer1Bean getSw_ver1() {
                        return sw_ver1;
                    }

                    public void setSw_ver1(SwVer1Bean sw_ver1) {
                        this.sw_ver1 = sw_ver1;
                    }

                    public SwVer2Bean getSw_ver2() {
                        return sw_ver2;
                    }

                    public void setSw_ver2(SwVer2Bean sw_ver2) {
                        this.sw_ver2 = sw_ver2;
                    }

                    public SafetySpecBean getSafety_spec() {
                        return safety_spec;
                    }

                    public void setSafety_spec(SafetySpecBean safety_spec) {
                        this.safety_spec = safety_spec;
                    }

                    public TotalRuntimeBean getTotal_runtime() {
                        return total_runtime;
                    }

                    public void setTotal_runtime(TotalRuntimeBean total_runtime) {
                        this.total_runtime = total_runtime;
                    }

                    public TodayRuntimeBean getToday_runtime() {
                        return today_runtime;
                    }

                    public void setToday_runtime(TodayRuntimeBean today_runtime) {
                        this.today_runtime = today_runtime;
                    }

                    public ClientipBean getClientip() {
                        return clientip;
                    }

                    public void setClientip(ClientipBean clientip) {
                        this.clientip = clientip;
                    }

                    public CurrentfmBean getCurrentfm() {
                        return currentfm;
                    }

                    public void setCurrentfm(CurrentfmBean currentfm) {
                        this.currentfm = currentfm;
                    }

                    public NewfmBean getNewfm() {
                        return newfm;
                    }

                    public void setNewfm(NewfmBean newfm) {
                        this.newfm = newfm;
                    }

                    public GpsBeanX getGps() {
                        return gps;
                    }

                    public void setGps(GpsBeanX gps) {
                        this.gps = gps;
                    }

                    public FaultBean getFault() {
                        return fault;
                    }

                    public void setFault(FaultBean fault) {
                        this.fault = fault;
                    }

                    public static class SwVer1Bean {
                        /**
                         * comment : software version1
                         * min : 0
                         * format : float
                         * type : number
                         */

                        private String comment;
                        private int min;
                        private String format;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class SwVer2Bean {
                        /**
                         * comment : software version2
                         * min : 0
                         * format : float
                         * type : number
                         */

                        private String comment;
                        private int min;
                        private String format;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class SafetySpecBean {
                        /**
                         * comment : 安规
                         * min : 0
                         * format : float
                         * type : number
                         */

                        private String comment;
                        private int min;
                        private String format;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class TotalRuntimeBean {
                        /**
                         * comment : 总运行时间
                         * unit : H
                         * min : 0
                         * format : float
                         * type : number
                         */

                        private String comment;
                        private String unit;
                        private int min;
                        private String format;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class TodayRuntimeBean {
                        /**
                         * comment : 当天运行时间
                         * unit : H
                         * min : 0
                         * format : float
                         * type : number
                         */

                        private String comment;
                        private String unit;
                        private int min;
                        private String format;
                        private String type;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getUnit() {
                            return unit;
                        }

                        public void setUnit(String unit) {
                            this.unit = unit;
                        }

                        public int getMin() {
                            return min;
                        }

                        public void setMin(int min) {
                            this.min = min;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }
                    }

                    public static class ClientipBean {
                        /**
                         * comment : client ip
                         * type : string
                         * maxLength : 32
                         */

                        private String comment;
                        private String type;
                        private int maxLength;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public int getMaxLength() {
                            return maxLength;
                        }

                        public void setMaxLength(int maxLength) {
                            this.maxLength = maxLength;
                        }
                    }

                    public static class CurrentfmBean {
                        /**
                         * comment : 设备当前固件的信息
                         * type : object
                         * properties : {"version":{"comment":"当前固件版本","type":"string","required":true}}
                         */

                        private String comment;
                        private String type;
                        private PropertiesBeanXXXX properties;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public PropertiesBeanXXXX getProperties() {
                            return properties;
                        }

                        public void setProperties(PropertiesBeanXXXX properties) {
                            this.properties = properties;
                        }

                        public static class PropertiesBeanXXXX {
                            /**
                             * version : {"comment":"当前固件版本","type":"string","required":true}
                             */

                            private VersionBean version;

                            public VersionBean getVersion() {
                                return version;
                            }

                            public void setVersion(VersionBean version) {
                                this.version = version;
                            }

                            public static class VersionBean {
                                /**
                                 * comment : 当前固件版本
                                 * type : string
                                 * required : true
                                 */

                                private String comment;
                                private String type;
                                private boolean required;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }
                            }
                        }
                    }

                    public static class NewfmBean {
                        /**
                         * comment : 待升级固件的信息
                         * type : object
                         * properties : {"isnew":{"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","type":"number","required":true,"enums":[0,1]},"devtype":{"comment":"设备型号","type":"string"},"version":{"comment":"新固件版本","type":"string"},"url":{"comment":"新固件地址","type":"string"}}
                         */

                        private String comment;
                        private String type;
                        private PropertiesBeanXXXXX properties;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public PropertiesBeanXXXXX getProperties() {
                            return properties;
                        }

                        public void setProperties(PropertiesBeanXXXXX properties) {
                            this.properties = properties;
                        }

                        public static class PropertiesBeanXXXXX {
                            /**
                             * isnew : {"comment":"是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)","type":"number","required":true,"enums":[0,1]}
                             * devtype : {"comment":"设备型号","type":"string"}
                             * version : {"comment":"新固件版本","type":"string"}
                             * url : {"comment":"新固件地址","type":"string"}
                             */

                            private IsnewBean isnew;
                            private DevtypeBeanXXX devtype;
                            private VersionBeanX version;
                            private UrlBean url;

                            public IsnewBean getIsnew() {
                                return isnew;
                            }

                            public void setIsnew(IsnewBean isnew) {
                                this.isnew = isnew;
                            }

                            public DevtypeBeanXXX getDevtype() {
                                return devtype;
                            }

                            public void setDevtype(DevtypeBeanXXX devtype) {
                                this.devtype = devtype;
                            }

                            public VersionBeanX getVersion() {
                                return version;
                            }

                            public void setVersion(VersionBeanX version) {
                                this.version = version;
                            }

                            public UrlBean getUrl() {
                                return url;
                            }

                            public void setUrl(UrlBean url) {
                                this.url = url;
                            }

                            public static class IsnewBean {
                                /**
                                 * comment : 是否存在待升级固件:不存在待升级固件(0),存在待升级固件(1)
                                 * type : number
                                 * required : true
                                 * enums : [0,1]
                                 */

                                private String comment;
                                private String type;
                                private boolean required;
                                private List<Integer> enums;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public List<Integer> getEnums() {
                                    return enums;
                                }

                                public void setEnums(List<Integer> enums) {
                                    this.enums = enums;
                                }
                            }

                            public static class DevtypeBeanXXX {
                                /**
                                 * comment : 设备型号
                                 * type : string
                                 */

                                private String comment;
                                private String type;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }

                            public static class VersionBeanX {
                                /**
                                 * comment : 新固件版本
                                 * type : string
                                 */

                                private String comment;
                                private String type;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }

                            public static class UrlBean {
                                /**
                                 * comment : 新固件地址
                                 * type : string
                                 */

                                private String comment;
                                private String type;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }
                        }
                    }

                    public static class GpsBeanX {
                        /**
                         * type : object
                         * comment : gps定位
                         * properties : {"latitude":{"type":"number","format":"float","comment":"经度"},"longitude":{"type":"number","format":"float","comment":"纬度"},"GPSTime":{"comment":"GPS信息时间戳","type":"number","format":"int"}}
                         */

                        private String type;
                        private String comment;
                        private PropertiesBeanXXXXXX properties;

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public PropertiesBeanXXXXXX getProperties() {
                            return properties;
                        }

                        public void setProperties(PropertiesBeanXXXXXX properties) {
                            this.properties = properties;
                        }

                        public static class PropertiesBeanXXXXXX {
                            /**
                             * latitude : {"type":"number","format":"float","comment":"经度"}
                             * longitude : {"type":"number","format":"float","comment":"纬度"}
                             * GPSTime : {"comment":"GPS信息时间戳","type":"number","format":"int"}
                             */

                            private LatitudeBeanX latitude;
                            private LongitudeBeanX longitude;
                            private GPSTimeBeanX GPSTime;

                            public LatitudeBeanX getLatitude() {
                                return latitude;
                            }

                            public void setLatitude(LatitudeBeanX latitude) {
                                this.latitude = latitude;
                            }

                            public LongitudeBeanX getLongitude() {
                                return longitude;
                            }

                            public void setLongitude(LongitudeBeanX longitude) {
                                this.longitude = longitude;
                            }

                            public GPSTimeBeanX getGPSTime() {
                                return GPSTime;
                            }

                            public void setGPSTime(GPSTimeBeanX GPSTime) {
                                this.GPSTime = GPSTime;
                            }

                            public static class LatitudeBeanX {
                                /**
                                 * type : number
                                 * format : float
                                 * comment : 经度
                                 */

                                private String type;
                                private String format;
                                private String comment;

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }
                            }

                            public static class LongitudeBeanX {
                                /**
                                 * type : number
                                 * format : float
                                 * comment : 纬度
                                 */

                                private String type;
                                private String format;
                                private String comment;

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }
                            }

                            public static class GPSTimeBeanX {
                                /**
                                 * comment : GPS信息时间戳
                                 * type : number
                                 * format : int
                                 */

                                private String comment;
                                private String type;
                                private String format;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }
                            }
                        }
                    }

                    public static class FaultBean {
                        /**
                         * comment : fault
                         * type : number
                         * format : int
                         */

                        private String comment;
                        private String type;
                        private String format;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getFormat() {
                            return format;
                        }

                        public void setFormat(String format) {
                            this.format = format;
                        }
                    }
                }

                public static class CommandsBean {
                    /**
                     * set : {"comment":"set prop","cmdtype":true,"args":{"name":{"format":"name","type":"string"},"value":{"type":"string"}}}
                     * set_config : {"comment":"配置设备参数，与具体的设备有关","cmdtype":true,"args":{}}
                     * sync_time : {"comment":"同步时间","cmdtype":true,"args":{"time":{"required":true,"type":"number"}}}
                     * notify_upgrade : {"comment":"通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}}
                     * exec_upgrade : {"comment":"通知设备更新固件，设备收到通知后，需立即更新固件","cmdtype":true,"args":{"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}}
                     * req_report : {"comment":"要求设备上报最新数据。","cmdtype":true,"args":{}}
                     * pass_through : {"comment":"透传命令","cmdtype":true,"show_frontend":true,"args":{"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据"}}}
                     */

                    private SetBean set;
                    private SetConfigBean set_config;
                    private SyncTimeBean sync_time;
                    private NotifyUpgradeBean notify_upgrade;
                    private ExecUpgradeBean exec_upgrade;
                    private ReqReportBean req_report;
                    private PassThroughBean pass_through;

                    public SetBean getSet() {
                        return set;
                    }

                    public void setSet(SetBean set) {
                        this.set = set;
                    }

                    public SetConfigBean getSet_config() {
                        return set_config;
                    }

                    public void setSet_config(SetConfigBean set_config) {
                        this.set_config = set_config;
                    }

                    public SyncTimeBean getSync_time() {
                        return sync_time;
                    }

                    public void setSync_time(SyncTimeBean sync_time) {
                        this.sync_time = sync_time;
                    }

                    public NotifyUpgradeBean getNotify_upgrade() {
                        return notify_upgrade;
                    }

                    public void setNotify_upgrade(NotifyUpgradeBean notify_upgrade) {
                        this.notify_upgrade = notify_upgrade;
                    }

                    public ExecUpgradeBean getExec_upgrade() {
                        return exec_upgrade;
                    }

                    public void setExec_upgrade(ExecUpgradeBean exec_upgrade) {
                        this.exec_upgrade = exec_upgrade;
                    }

                    public ReqReportBean getReq_report() {
                        return req_report;
                    }

                    public void setReq_report(ReqReportBean req_report) {
                        this.req_report = req_report;
                    }

                    public PassThroughBean getPass_through() {
                        return pass_through;
                    }

                    public void setPass_through(PassThroughBean pass_through) {
                        this.pass_through = pass_through;
                    }

                    public static class SetBean {
                        /**
                         * comment : set prop
                         * cmdtype : true
                         * args : {"name":{"format":"name","type":"string"},"value":{"type":"string"}}
                         */

                        private String comment;
                        private boolean cmdtype;
                        private ArgsBean args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isCmdtype() {
                            return cmdtype;
                        }

                        public void setCmdtype(boolean cmdtype) {
                            this.cmdtype = cmdtype;
                        }

                        public ArgsBean getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBean args) {
                            this.args = args;
                        }

                        public static class ArgsBean {
                            /**
                             * name : {"format":"name","type":"string"}
                             * value : {"type":"string"}
                             */

                            private NameBean name;
                            private ValueBean value;

                            public NameBean getName() {
                                return name;
                            }

                            public void setName(NameBean name) {
                                this.name = name;
                            }

                            public ValueBean getValue() {
                                return value;
                            }

                            public void setValue(ValueBean value) {
                                this.value = value;
                            }

                            public static class NameBean {
                                /**
                                 * format : name
                                 * type : string
                                 */

                                private String format;
                                private String type;

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }

                            public static class ValueBean {
                                /**
                                 * type : string
                                 */

                                private String type;

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }
                        }
                    }

                    public static class SetConfigBean {
                        /**
                         * comment : 配置设备参数，与具体的设备有关
                         * cmdtype : true
                         * args : {}
                         */

                        private String comment;
                        private boolean cmdtype;
                        private ArgsBeanX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isCmdtype() {
                            return cmdtype;
                        }

                        public void setCmdtype(boolean cmdtype) {
                            this.cmdtype = cmdtype;
                        }

                        public ArgsBeanX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanX {
                        }
                    }

                    public static class SyncTimeBean {
                        /**
                         * comment : 同步时间
                         * cmdtype : true
                         * args : {"time":{"required":true,"type":"number"}}
                         */

                        private String comment;
                        private boolean cmdtype;
                        private ArgsBeanXX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isCmdtype() {
                            return cmdtype;
                        }

                        public void setCmdtype(boolean cmdtype) {
                            this.cmdtype = cmdtype;
                        }

                        public ArgsBeanXX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanXX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanXX {
                            /**
                             * time : {"required":true,"type":"number"}
                             */

                            private TimeBean time;

                            public TimeBean getTime() {
                                return time;
                            }

                            public void setTime(TimeBean time) {
                                this.time = time;
                            }

                            public static class TimeBean {
                                /**
                                 * required : true
                                 * type : number
                                 */

                                private boolean required;
                                private String type;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }
                        }
                    }

                    public static class NotifyUpgradeBean {
                        /**
                         * comment : 通知设备有新固件，设备收到通知后，可提示用户有更新但不执行更新，也可后台自动更新固件
                         * cmdtype : true
                         * args : {"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}
                         */

                        private String comment;
                        private boolean cmdtype;
                        private ArgsBeanXXX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isCmdtype() {
                            return cmdtype;
                        }

                        public void setCmdtype(boolean cmdtype) {
                            this.cmdtype = cmdtype;
                        }

                        public ArgsBeanXXX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanXXX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanXXX {
                            /**
                             * devtype : {"required":true,"type":"string"}
                             * version : {"required":true,"type":"string"}
                             * url : {"required":true,"type":"string"}
                             */

                            private DevtypeBeanXXXX devtype;
                            private VersionBeanXX version;
                            private UrlBeanX url;

                            public DevtypeBeanXXXX getDevtype() {
                                return devtype;
                            }

                            public void setDevtype(DevtypeBeanXXXX devtype) {
                                this.devtype = devtype;
                            }

                            public VersionBeanXX getVersion() {
                                return version;
                            }

                            public void setVersion(VersionBeanXX version) {
                                this.version = version;
                            }

                            public UrlBeanX getUrl() {
                                return url;
                            }

                            public void setUrl(UrlBeanX url) {
                                this.url = url;
                            }

                            public static class DevtypeBeanXXXX {
                                /**
                                 * required : true
                                 * type : string
                                 */

                                private boolean required;
                                private String type;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }

                            public static class VersionBeanXX {
                                /**
                                 * required : true
                                 * type : string
                                 */

                                private boolean required;
                                private String type;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }

                            public static class UrlBeanX {
                                /**
                                 * required : true
                                 * type : string
                                 */

                                private boolean required;
                                private String type;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }
                        }
                    }

                    public static class ExecUpgradeBean {
                        /**
                         * comment : 通知设备更新固件，设备收到通知后，需立即更新固件
                         * cmdtype : true
                         * args : {"devtype":{"required":true,"type":"string"},"version":{"required":true,"type":"string"},"url":{"required":true,"type":"string"}}
                         */

                        private String comment;
                        private boolean cmdtype;
                        private ArgsBeanXXXX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isCmdtype() {
                            return cmdtype;
                        }

                        public void setCmdtype(boolean cmdtype) {
                            this.cmdtype = cmdtype;
                        }

                        public ArgsBeanXXXX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanXXXX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanXXXX {
                            /**
                             * devtype : {"required":true,"type":"string"}
                             * version : {"required":true,"type":"string"}
                             * url : {"required":true,"type":"string"}
                             */

                            private DevtypeBeanXXXXX devtype;
                            private VersionBeanXXX version;
                            private UrlBeanXX url;

                            public DevtypeBeanXXXXX getDevtype() {
                                return devtype;
                            }

                            public void setDevtype(DevtypeBeanXXXXX devtype) {
                                this.devtype = devtype;
                            }

                            public VersionBeanXXX getVersion() {
                                return version;
                            }

                            public void setVersion(VersionBeanXXX version) {
                                this.version = version;
                            }

                            public UrlBeanXX getUrl() {
                                return url;
                            }

                            public void setUrl(UrlBeanXX url) {
                                this.url = url;
                            }

                            public static class DevtypeBeanXXXXX {
                                /**
                                 * required : true
                                 * type : string
                                 */

                                private boolean required;
                                private String type;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }

                            public static class VersionBeanXXX {
                                /**
                                 * required : true
                                 * type : string
                                 */

                                private boolean required;
                                private String type;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }

                            public static class UrlBeanXX {
                                /**
                                 * required : true
                                 * type : string
                                 */

                                private boolean required;
                                private String type;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }
                        }
                    }

                    public static class ReqReportBean {
                        /**
                         * comment : 要求设备上报最新数据。
                         * cmdtype : true
                         * args : {}
                         */

                        private String comment;
                        private boolean cmdtype;
                        private ArgsBeanXXXXX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isCmdtype() {
                            return cmdtype;
                        }

                        public void setCmdtype(boolean cmdtype) {
                            this.cmdtype = cmdtype;
                        }

                        public ArgsBeanXXXXX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanXXXXX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanXXXXX {
                        }
                    }

                    public static class PassThroughBean {
                        /**
                         * comment : 透传命令
                         * cmdtype : true
                         * show_frontend : true
                         * args : {"format":{"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"},"raw":{"required":true,"type":"string","comment":"数据"}}
                         */

                        private String comment;
                        private boolean cmdtype;
                        private boolean show_frontend;
                        private ArgsBeanXXXXXX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public boolean isCmdtype() {
                            return cmdtype;
                        }

                        public void setCmdtype(boolean cmdtype) {
                            this.cmdtype = cmdtype;
                        }

                        public boolean isShow_frontend() {
                            return show_frontend;
                        }

                        public void setShow_frontend(boolean show_frontend) {
                            this.show_frontend = show_frontend;
                        }

                        public ArgsBeanXXXXXX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanXXXXXX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanXXXXXX {
                            /**
                             * format : {"required":true,"type":"string","enums":["base64","hex","ascii"],"comment":"编码格式"}
                             * raw : {"required":true,"type":"string","comment":"数据"}
                             */

                            private FormatBean format;
                            private RawBean raw;

                            public FormatBean getFormat() {
                                return format;
                            }

                            public void setFormat(FormatBean format) {
                                this.format = format;
                            }

                            public RawBean getRaw() {
                                return raw;
                            }

                            public void setRaw(RawBean raw) {
                                this.raw = raw;
                            }

                            public static class FormatBean {
                                /**
                                 * required : true
                                 * type : string
                                 * enums : ["base64","hex","ascii"]
                                 * comment : 编码格式
                                 */

                                private boolean required;
                                private String type;
                                private String comment;
                                private List<String> enums;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public List<String> getEnums() {
                                    return enums;
                                }

                                public void setEnums(List<String> enums) {
                                    this.enums = enums;
                                }
                            }

                            public static class RawBean {
                                /**
                                 * required : true
                                 * type : string
                                 * comment : 数据
                                 */

                                private boolean required;
                                private String type;
                                private String comment;

                                public boolean isRequired() {
                                    return required;
                                }

                                public void setRequired(boolean required) {
                                    this.required = required;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }
                            }
                        }
                    }
                }

                public static class WarningsBean {
                    /**
                     * temperature_high : {"comment":"工作温度偏高","args":{"value":{"format":"float","type":"number"}}}
                     */

                    private TemperatureHighBean temperature_high;

                    public TemperatureHighBean getTemperature_high() {
                        return temperature_high;
                    }

                    public void setTemperature_high(TemperatureHighBean temperature_high) {
                        this.temperature_high = temperature_high;
                    }

                    public static class TemperatureHighBean {
                        /**
                         * comment : 工作温度偏高
                         * args : {"value":{"format":"float","type":"number"}}
                         */

                        private String comment;
                        private ArgsBeanXXXXXXX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public ArgsBeanXXXXXXX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanXXXXXXX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanXXXXXXX {
                            /**
                             * value : {"format":"float","type":"number"}
                             */

                            private ValueBeanX value;

                            public ValueBeanX getValue() {
                                return value;
                            }

                            public void setValue(ValueBeanX value) {
                                this.value = value;
                            }

                            public static class ValueBeanX {
                                /**
                                 * format : float
                                 * type : number
                                 */

                                private String format;
                                private String type;

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }
                        }
                    }
                }

                public static class ErrorsBean {
                    /**
                     * temperature_too_high : {"comment":"工作温度过高","args":{"value":{"format":"float","type":"number"}}}
                     */

                    private TemperatureTooHighBean temperature_too_high;

                    public TemperatureTooHighBean getTemperature_too_high() {
                        return temperature_too_high;
                    }

                    public void setTemperature_too_high(TemperatureTooHighBean temperature_too_high) {
                        this.temperature_too_high = temperature_too_high;
                    }

                    public static class TemperatureTooHighBean {
                        /**
                         * comment : 工作温度过高
                         * args : {"value":{"format":"float","type":"number"}}
                         */

                        private String comment;
                        private ArgsBeanXXXXXXXX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public ArgsBeanXXXXXXXX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanXXXXXXXX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanXXXXXXXX {
                            /**
                             * value : {"format":"float","type":"number"}
                             */

                            private ValueBeanXX value;

                            public ValueBeanXX getValue() {
                                return value;
                            }

                            public void setValue(ValueBeanXX value) {
                                this.value = value;
                            }

                            public static class ValueBeanXX {
                                /**
                                 * format : float
                                 * type : number
                                 */

                                private String format;
                                private String type;

                                public String getFormat() {
                                    return format;
                                }

                                public void setFormat(String format) {
                                    this.format = format;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }
                        }
                    }
                }

                public static class LogsBean {
                    /**
                     * loginfo : {"comment":"日志信息","args":{"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}}
                     */

                    private LoginfoBean loginfo;

                    public LoginfoBean getLoginfo() {
                        return loginfo;
                    }

                    public void setLoginfo(LoginfoBean loginfo) {
                        this.loginfo = loginfo;
                    }

                    public static class LoginfoBean {
                        /**
                         * comment : 日志信息
                         * args : {"level":{"comment":"日志等级","type":"number"},"info":{"comment":"日志信息","type":"string"}}
                         */

                        private String comment;
                        private ArgsBeanXXXXXXXXX args;

                        public String getComment() {
                            return comment;
                        }

                        public void setComment(String comment) {
                            this.comment = comment;
                        }

                        public ArgsBeanXXXXXXXXX getArgs() {
                            return args;
                        }

                        public void setArgs(ArgsBeanXXXXXXXXX args) {
                            this.args = args;
                        }

                        public static class ArgsBeanXXXXXXXXX {
                            /**
                             * level : {"comment":"日志等级","type":"number"}
                             * info : {"comment":"日志信息","type":"string"}
                             */

                            private LevelBean level;
                            private InfoBean info;

                            public LevelBean getLevel() {
                                return level;
                            }

                            public void setLevel(LevelBean level) {
                                this.level = level;
                            }

                            public InfoBean getInfo() {
                                return info;
                            }

                            public void setInfo(InfoBean info) {
                                this.info = info;
                            }

                            public static class LevelBean {
                                /**
                                 * comment : 日志等级
                                 * type : number
                                 */

                                private String comment;
                                private String type;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }

                            public static class InfoBean {
                                /**
                                 * comment : 日志信息
                                 * type : string
                                 */

                                private String comment;
                                private String type;

                                public String getComment() {
                                    return comment;
                                }

                                public void setComment(String comment) {
                                    this.comment = comment;
                                }

                                public String getType() {
                                    return type;
                                }

                                public void setType(String type) {
                                    this.type = type;
                                }
                            }
                        }
                    }
                }

                public static class DataIndexsBean {
                    /**
                     * indexs : {"time":-1}
                     * options : {}
                     */

                    private IndexsBean indexs;
                    private OptionsBean options;

                    public IndexsBean getIndexs() {
                        return indexs;
                    }

                    public void setIndexs(IndexsBean indexs) {
                        this.indexs = indexs;
                    }

                    public OptionsBean getOptions() {
                        return options;
                    }

                    public void setOptions(OptionsBean options) {
                        this.options = options;
                    }

                    public static class IndexsBean {
                    }

                    public static class OptionsBean {
                    }
                }
            }

            public static class DevicesBean {
                /**
                 * count : 3
                 */

                private int count;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }
            }
        }
    }
}
