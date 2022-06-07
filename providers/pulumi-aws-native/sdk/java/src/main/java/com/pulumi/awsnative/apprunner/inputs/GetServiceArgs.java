// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    /**
     * The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    @Import(name="serviceArn", required=true)
    private Output<String> serviceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppRunner Service.
     * 
     */
    public Output<String> serviceArn() {
        return this.serviceArn;
    }

    private GetServiceArgs() {}

    private GetServiceArgs(GetServiceArgs $) {
        this.serviceArn = $.serviceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceArgs $;

        public Builder() {
            $ = new GetServiceArgs();
        }

        public Builder(GetServiceArgs defaults) {
            $ = new GetServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceArn The Amazon Resource Name (ARN) of the AppRunner Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceArn(Output<String> serviceArn) {
            $.serviceArn = serviceArn;
            return this;
        }

        /**
         * @param serviceArn The Amazon Resource Name (ARN) of the AppRunner Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceArn(String serviceArn) {
            return serviceArn(Output.of(serviceArn));
        }

        public GetServiceArgs build() {
            $.serviceArn = Objects.requireNonNull($.serviceArn, "expected parameter 'serviceArn' to be non-null");
            return $;
        }
    }

}
