package io.terminus.trantor.example.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.TModelFieldType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/**
 * Created by hedy on 2020/12/14.
 */

@EqualsAndHashCode(callSuper = true)
@Data
@TModel(
        name = "示例用户模型"
)
// 通过Trantor的TModel注解来标示普通Java对象为一个trantor的模型资源;
// 通过TModel注解的name属性标示模型的名称，改名称在交付控制台可见;
public class ExampleUser extends BaseModel<Long> {

    // 通过Trantor的TModelField注解为示例用户模型 name 字段;
    // 通过TModelField注解的nullable属性添加在数据库表中name字段不可以为空;
    // 通过JSR303注解为示例用户模型 name 字段添加页面输入检查不能为空;
    @TModelField(name = "用户名", nullable = false)
    @NotNull(message = "用户名不可为空")
    private String name;

    // 通过TModelField注解的type属性添加页面输入邮箱格式检查
    @TModelField(name = "邮箱", type = TModelFieldType.Email)
    private String email;


}
