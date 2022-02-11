// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.athena.PreparedStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:athena:PreparedStatement")
public class PreparedStatement extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="queryStatement", type=String.class, parameters={})
    private Output<String> queryStatement;

    public Output<String> getQueryStatement() {
        return this.queryStatement;
    }
    @OutputExport(name="statementName", type=String.class, parameters={})
    private Output<String> statementName;

    public Output<String> getStatementName() {
        return this.statementName;
    }
    @OutputExport(name="workGroup", type=String.class, parameters={})
    private Output<String> workGroup;

    public Output<String> getWorkGroup() {
        return this.workGroup;
    }

    public PreparedStatement(String name, PreparedStatementArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:PreparedStatement", name, args == null ? PreparedStatementArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PreparedStatement(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:athena:PreparedStatement", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PreparedStatement get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PreparedStatement(name, id, options);
    }
}
