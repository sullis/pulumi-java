// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAuthorizerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizerPlainArgs Empty = new GetAuthorizerPlainArgs();

    @Import(name="authorizerName", required=true)
    private String authorizerName;

    public String authorizerName() {
        return this.authorizerName;
    }

    private GetAuthorizerPlainArgs() {}

    private GetAuthorizerPlainArgs(GetAuthorizerPlainArgs $) {
        this.authorizerName = $.authorizerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizerPlainArgs $;

        public Builder() {
            $ = new GetAuthorizerPlainArgs();
        }

        public Builder(GetAuthorizerPlainArgs defaults) {
            $ = new GetAuthorizerPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizerName(String authorizerName) {
            $.authorizerName = authorizerName;
            return this;
        }

        public GetAuthorizerPlainArgs build() {
            $.authorizerName = Objects.requireNonNull($.authorizerName, "expected parameter 'authorizerName' to be non-null");
            return $;
        }
    }

}
