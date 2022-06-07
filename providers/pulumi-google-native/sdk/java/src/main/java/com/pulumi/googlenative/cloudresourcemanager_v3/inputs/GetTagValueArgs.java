// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagValueArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagValueArgs Empty = new GetTagValueArgs();

    @Import(name="tagValueId", required=true)
    private Output<String> tagValueId;

    public Output<String> tagValueId() {
        return this.tagValueId;
    }

    private GetTagValueArgs() {}

    private GetTagValueArgs(GetTagValueArgs $) {
        this.tagValueId = $.tagValueId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagValueArgs $;

        public Builder() {
            $ = new GetTagValueArgs();
        }

        public Builder(GetTagValueArgs defaults) {
            $ = new GetTagValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder tagValueId(Output<String> tagValueId) {
            $.tagValueId = tagValueId;
            return this;
        }

        public Builder tagValueId(String tagValueId) {
            return tagValueId(Output.of(tagValueId));
        }

        public GetTagValueArgs build() {
            $.tagValueId = Objects.requireNonNull($.tagValueId, "expected parameter 'tagValueId' to be non-null");
            return $;
        }
    }

}
