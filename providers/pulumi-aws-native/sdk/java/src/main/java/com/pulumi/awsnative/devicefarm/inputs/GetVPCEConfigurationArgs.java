// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devicefarm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVPCEConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVPCEConfigurationArgs Empty = new GetVPCEConfigurationArgs();

    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    private GetVPCEConfigurationArgs() {}

    private GetVPCEConfigurationArgs(GetVPCEConfigurationArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVPCEConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVPCEConfigurationArgs $;

        public Builder() {
            $ = new GetVPCEConfigurationArgs();
        }

        public Builder(GetVPCEConfigurationArgs defaults) {
            $ = new GetVPCEConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetVPCEConfigurationArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
