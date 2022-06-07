// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.greengrassv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetComponentVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComponentVersionPlainArgs Empty = new GetComponentVersionPlainArgs();

    @Import(name="arn", required=true)
    private String arn;

    public String arn() {
        return this.arn;
    }

    private GetComponentVersionPlainArgs() {}

    private GetComponentVersionPlainArgs(GetComponentVersionPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComponentVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComponentVersionPlainArgs $;

        public Builder() {
            $ = new GetComponentVersionPlainArgs();
        }

        public Builder(GetComponentVersionPlainArgs defaults) {
            $ = new GetComponentVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetComponentVersionPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
