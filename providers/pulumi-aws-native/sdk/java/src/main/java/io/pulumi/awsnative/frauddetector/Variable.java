// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.frauddetector.VariableArgs;
import io.pulumi.awsnative.frauddetector.enums.VariableDataSource;
import io.pulumi.awsnative.frauddetector.enums.VariableDataType;
import io.pulumi.awsnative.frauddetector.enums.VariableType;
import io.pulumi.awsnative.frauddetector.outputs.VariableTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:frauddetector:Variable")
public class Variable extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    @OutputExport(name="dataSource", type=VariableDataSource.class, parameters={})
    private Output<VariableDataSource> dataSource;

    public Output<VariableDataSource> getDataSource() {
        return this.dataSource;
    }
    @OutputExport(name="dataType", type=VariableDataType.class, parameters={})
    private Output<VariableDataType> dataType;

    public Output<VariableDataType> getDataType() {
        return this.dataType;
    }
    @OutputExport(name="defaultValue", type=String.class, parameters={})
    private Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={VariableTag.class})
    private Output</* @Nullable */ List<VariableTag>> tags;

    public Output</* @Nullable */ List<VariableTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="variableType", type=VariableType.class, parameters={})
    private Output</* @Nullable */ VariableType> variableType;

    public Output</* @Nullable */ VariableType> getVariableType() {
        return this.variableType;
    }

    public Variable(String name, VariableArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:frauddetector:Variable", name, args == null ? VariableArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Variable(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:frauddetector:Variable", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Variable get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Variable(name, id, options);
    }
}
