<template>
<div :style='{"width":"1100px","padding":"20px","boxShadow":"0px 4px 10px 0px rgba(0,0,0,0.302)","margin":"10px auto","position":"relative","background":"#fff"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="预订编号" prop="yudingbianhao">
              <el-input v-model="ruleForm.yudingbianhao" placeholder="预订编号" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="车序号" prop="chexuhao">
            <el-input v-model="ruleForm.chexuhao" 
                placeholder="车序号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="火车类型" prop="huocheleixing">
            <el-input v-model="ruleForm.huocheleixing" 
                placeholder="火车类型" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="车次号" prop="checihao">
            <el-input v-model="ruleForm.checihao" 
                placeholder="车次号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="起点站" prop="qidianzhan">
            <el-input v-model="ruleForm.qidianzhan" 
                placeholder="起点站" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="终点站" prop="zhongdianzhan">
            <el-input v-model="ruleForm.zhongdianzhan" 
                placeholder="终点站" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="开车时间" prop="kaicheshijian" >
              <el-date-picker
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.kaicheshijian" 
                  type="datetime"
                  placeholder="开车时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="到站时间" prop="daozhanshijian" >
              <el-date-picker
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.daozhanshijian" 
                  type="datetime"
                  placeholder="到站时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="车票类型" prop="chepiaoleixing">
            <el-select v-model="ruleForm.chepiaoleixing" placeholder="请选择车票类型"  >
              <el-option
                  v-for="(item,index) in chepiaoleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="座位类型" prop="zuoweileixing">
            <el-select v-model="ruleForm.zuoweileixing" placeholder="请选择座位类型"  >
              <el-option
                  v-for="(item,index) in zuoweileixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="价格类型" prop="jiageleixing">
            <el-select v-model="ruleForm.jiageleixing" placeholder="请选择价格类型"  >
              <el-option
                  v-for="(item,index) in jiageleixingOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="车票价格" prop="chepiaojiage">
            <el-input v-model="ruleForm.chepiaojiage" 
                placeholder="车票价格" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="车票" prop="chepiaoshu">
            <el-select v-model="ruleForm.chepiaoshu" placeholder="请选择车票"  >
              <el-option
                  v-for="(item,index) in chepiaoshuOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="总价" prop="zongjia">
              <el-input v-model="zongjia" placeholder="总价" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="预订时间" prop="yudingshijian" >
              <el-date-picker
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.yudingshijian" 
                  type="datetime"
                  placeholder="预订时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="用户账号" prop="yonghuzhanghao">
            <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="用户姓名" prop="yonghuxingming">
            <el-input v-model="ruleForm.yonghuxingming" 
                placeholder="用户姓名" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="预订备注" prop="yudingbeizhu">
            <editor 
                :style='{"padding":"0","margin":"0","borderColor":"#00B9EA","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","background":"#f6f6f6","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.yudingbeizhu" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"rgba(252, 190, 75, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#00b9ea","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            yudingbianhao : false,
            chexuhao : false,
            huocheleixing : false,
            checihao : false,
            qidianzhan : false,
            zhongdianzhan : false,
            kaicheshijian : false,
            daozhanshijian : false,
            chepiaoleixing : false,
            zuoweileixing : false,
            jiageleixing : false,
            chepiaojiage : false,
            chepiaoshu : false,
            zongjia : false,
            yudingshijian : false,
            yudingbeizhu : false,
            yonghuzhanghao : false,
            yonghuxingming : false,
            sfsh : false,
            shhf : false,
            ispay : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          yudingbianhao: this.getUUID(),
          chexuhao: '',
          huocheleixing: '',
          checihao: '',
          qidianzhan: '',
          zhongdianzhan: '',
          kaicheshijian: '',
          daozhanshijian: '',
          chepiaoleixing: '',
          zuoweileixing: '',
          jiageleixing: '',
          chepiaojiage: '',
          chepiaoshu: '',
          zongjia: '',
          yudingshijian: '',
          yudingbeizhu: '',
          yonghuzhanghao: '',
          yonghuxingming: '',
          ispay: '',
        },
        chepiaoleixingOptions: [],
        zuoweileixingOptions: [],
        jiageleixingOptions: [],
        chepiaoshuOptions: [],
        rules: {
          yudingbianhao: [
          ],
          chexuhao: [
          ],
          huocheleixing: [
          ],
          checihao: [
          ],
          qidianzhan: [
            { required: true, message: '起点站不能为空', trigger: 'blur' },
          ],
          zhongdianzhan: [
            { required: true, message: '终点站不能为空', trigger: 'blur' },
          ],
          kaicheshijian: [
            { required: true, message: '开车时间不能为空', trigger: 'blur' },
          ],
          daozhanshijian: [
            { required: true, message: '到站时间不能为空', trigger: 'blur' },
          ],
          chepiaoleixing: [
          ],
          zuoweileixing: [
          ],
          jiageleixing: [
            { required: true, message: '价格类型不能为空', trigger: 'blur' },
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          chepiaojiage: [
            { required: true, message: '车票价格不能为空', trigger: 'blur' },
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          chepiaoshu: [
            { required: true, message: '车票不能为空', trigger: 'blur' },
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          zongjia: [
            { validator: this.$validate.isNumber, trigger: 'blur' },
          ],
          yudingshijian: [
          ],
          yudingbeizhu: [
          ],
          yonghuzhanghao: [
          ],
          yonghuxingming: [
          ],
          sfsh: [
          ],
          shhf: [
          ],
          ispay: [
          ],
        },
      };
    },
    computed: {


        zongjia:{
            get: function () {
                return 1*this.ruleForm.jiageleixing*this.ruleForm.chepiaojiage*this.ruleForm.chepiaoshu
            }
        },

    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.yudingshijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='yudingbianhao'){
              this.ruleForm.yudingbianhao = obj[o];
              this.ro.yudingbianhao = true;
              continue;
            }
            if(o=='chexuhao'){
              this.ruleForm.chexuhao = obj[o];
              this.ro.chexuhao = true;
              continue;
            }
            if(o=='huocheleixing'){
              this.ruleForm.huocheleixing = obj[o];
              this.ro.huocheleixing = true;
              continue;
            }
            if(o=='checihao'){
              this.ruleForm.checihao = obj[o];
              this.ro.checihao = true;
              continue;
            }
            if(o=='qidianzhan'){
              this.ruleForm.qidianzhan = obj[o];
              this.ro.qidianzhan = true;
              continue;
            }
            if(o=='zhongdianzhan'){
              this.ruleForm.zhongdianzhan = obj[o];
              this.ro.zhongdianzhan = true;
              continue;
            }
            if(o=='kaicheshijian'){
              this.ruleForm.kaicheshijian = obj[o];
              this.ro.kaicheshijian = true;
              continue;
            }
            if(o=='daozhanshijian'){
              this.ruleForm.daozhanshijian = obj[o];
              this.ro.daozhanshijian = true;
              continue;
            }
            if(o=='chepiaoleixing'){
              this.ruleForm.chepiaoleixing = obj[o];
              this.ro.chepiaoleixing = true;
              continue;
            }
            if(o=='zuoweileixing'){
              this.ruleForm.zuoweileixing = obj[o];
              this.ro.zuoweileixing = true;
              continue;
            }
            if(o=='jiageleixing'){
              this.ruleForm.jiageleixing = obj[o];
              this.ro.jiageleixing = true;
              continue;
            }
            if(o=='chepiaojiage'){
              this.ruleForm.chepiaojiage = obj[o];
              this.ro.chepiaojiage = true;
              continue;
            }
            if(o=='chepiaoshu'){
              this.ruleForm.chepiaoshu = obj[o];
              this.ro.chepiaoshu = true;
              continue;
            }
            if(o=='zongjia'){
              this.ruleForm.zongjia = obj[o];
              this.ro.zongjia = true;
              continue;
            }
            if(o=='yudingshijian'){
              this.ruleForm.yudingshijian = obj[o];
              this.ro.yudingshijian = true;
              continue;
            }
            if(o=='yudingbeizhu'){
              this.ruleForm.yudingbeizhu = obj[o];
              this.ro.yudingbeizhu = true;
              continue;
            }
            if(o=='yonghuzhanghao'){
              this.ruleForm.yonghuzhanghao = obj[o];
              this.ro.yonghuzhanghao = true;
              continue;
            }
            if(o=='yonghuxingming'){
              this.ruleForm.yonghuxingming = obj[o];
              this.ro.yonghuxingming = true;
              continue;
            }
          }
          this.ruleForm.chepiaoshu = 0
        }
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.yonghuzhanghao!=''&&json.yonghuzhanghao) || json.yonghuzhanghao==0){
                this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
            }
            if((json.yonghuxingming!=''&&json.yonghuxingming) || json.yonghuxingming==0){
                this.ruleForm.yonghuxingming = json.yonghuxingming
            }
          }
        });
        this.chepiaoleixingOptions = "单程,往返".split(',')
        this.zuoweileixingOptions = "硬座,软座,硬卧,软卧,软座".split(',')
        this.jiageleixingOptions = "1,2".split(',')
        this.chepiaoshuOptions = "1".split(',')
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('chepiaoyuding/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

          this.ruleForm.zongjia = this.zongjia
        var obj = JSON.parse(localStorage.getItem('crossObj'));
        var table = localStorage.getItem('crossTable');
        obj.chepiaoshu = obj.chepiaoshu - this.ruleForm.chepiaoshu
        if(obj.chepiaoshu<0){
          this.$message.error("车票不足");
          return
        }
      
        //this.$http.post(table+`/update`, obj).then(res => {});
        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('chepiaoyuding/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算
                          var obj = JSON.parse(localStorage.getItem('crossObj'));
                          var table = localStorage.getItem('crossTable');

                          obj.chepiaoshu = parseFloat(obj.chepiaoshu) - parseFloat(this.ruleForm.chepiaoshu)

                          this.$http.post(table+`/update`,obj).then(res => {});
                          this.$http.post('chepiaoyuding/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {
                  var obj = JSON.parse(localStorage.getItem('crossObj'));
                  var table = localStorage.getItem('crossTable');

                  obj.chepiaoshu = parseFloat(obj.chepiaoshu) - parseFloat(this.ruleForm.chepiaoshu)

                  this.$http.post(table+`/update`,obj).then(res => {});
                  this.$http.post('chepiaoyuding/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #00B9EA;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  background: #f6f6f6;
	  width: 300px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #00B9EA;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #000;
	  background: #f6f6f6;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #00B9EA;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #000;
	  background: #f6f6f6;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed #00B9EA;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #00B9EA;
	  background: #f6f6f6;
	  width: 80px;
	  font-size: 32px;
	  line-height: 80px;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed #00B9EA;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #00B9EA;
	  background: #f6f6f6;
	  width: 80px;
	  font-size: 32px;
	  line-height: 80px;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed #00B9EA;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #00B9EA;
	  background: #f6f6f6;
	  width: 80px;
	  font-size: 32px;
	  line-height: 80px;
	  text-align: center;
	  height: 80px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #00B9EA;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #000;
	  background: #f6f6f6;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
