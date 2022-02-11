// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.configuration.StoredQueryArgs;
import io.pulumi.awsnative.configuration.outputs.StoredQueryTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:configuration:StoredQuery")
public class StoredQuery extends io.pulumi.resources.CustomResource {
    @OutputExport(name="queryArn", type=String.class, parameters={})
    private Output<String> queryArn;

    public Output<String> getQueryArn() {
        return this.queryArn;
    }
    @OutputExport(name="queryDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryDescription;

    public Output</* @Nullable */ String> getQueryDescription() {
        return this.queryDescription;
    }
    @OutputExport(name="queryExpression", type=String.class, parameters={})
    private Output<String> queryExpression;

    public Output<String> getQueryExpression() {
        return this.queryExpression;
    }
    @OutputExport(name="queryId", type=String.class, parameters={})
    private Output<String> queryId;

    public Output<String> getQueryId() {
        return this.queryId;
    }
    @OutputExport(name="queryName", type=String.class, parameters={})
    private Output<String> queryName;

    public Output<String> getQueryName() {
        return this.queryName;
    }
    @OutputExport(name="tags", type=List.class, parameters={StoredQueryTag.class})
    private Output</* @Nullable */ List<StoredQueryTag>> tags;

    public Output</* @Nullable */ List<StoredQueryTag>> getTags() {
        return this.tags;
    }

    public StoredQuery(String name, StoredQueryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:configuration:StoredQuery", name, args == null ? StoredQueryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StoredQuery(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:configuration:StoredQuery", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static StoredQuery get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StoredQuery(name, id, options);
    }
}
