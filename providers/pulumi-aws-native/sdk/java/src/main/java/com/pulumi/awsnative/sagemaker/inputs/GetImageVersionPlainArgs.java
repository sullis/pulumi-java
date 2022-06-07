// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImageVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageVersionPlainArgs Empty = new GetImageVersionPlainArgs();

    @Import(name="imageVersionArn", required=true)
    private String imageVersionArn;

    public String imageVersionArn() {
        return this.imageVersionArn;
    }

    private GetImageVersionPlainArgs() {}

    private GetImageVersionPlainArgs(GetImageVersionPlainArgs $) {
        this.imageVersionArn = $.imageVersionArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageVersionPlainArgs $;

        public Builder() {
            $ = new GetImageVersionPlainArgs();
        }

        public Builder(GetImageVersionPlainArgs defaults) {
            $ = new GetImageVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder imageVersionArn(String imageVersionArn) {
            $.imageVersionArn = imageVersionArn;
            return this;
        }

        public GetImageVersionPlainArgs build() {
            $.imageVersionArn = Objects.requireNonNull($.imageVersionArn, "expected parameter 'imageVersionArn' to be non-null");
            return $;
        }
    }

}
