// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCloudFrontOriginAccessIdentityArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudFrontOriginAccessIdentityArgs Empty = new GetCloudFrontOriginAccessIdentityArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private GetCloudFrontOriginAccessIdentityArgs() {}

    private GetCloudFrontOriginAccessIdentityArgs(GetCloudFrontOriginAccessIdentityArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudFrontOriginAccessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudFrontOriginAccessIdentityArgs $;

        public Builder() {
            $ = new GetCloudFrontOriginAccessIdentityArgs();
        }

        public Builder(GetCloudFrontOriginAccessIdentityArgs defaults) {
            $ = new GetCloudFrontOriginAccessIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetCloudFrontOriginAccessIdentityArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
