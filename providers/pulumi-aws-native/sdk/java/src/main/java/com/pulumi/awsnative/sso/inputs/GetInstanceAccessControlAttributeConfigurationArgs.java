// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceAccessControlAttributeConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceAccessControlAttributeConfigurationArgs Empty = new GetInstanceAccessControlAttributeConfigurationArgs();

    /**
     * The ARN of the AWS SSO instance under which the operation will be executed.
     * 
     */
    @Import(name="instanceArn", required=true)
    private Output<String> instanceArn;

    /**
     * @return The ARN of the AWS SSO instance under which the operation will be executed.
     * 
     */
    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    private GetInstanceAccessControlAttributeConfigurationArgs() {}

    private GetInstanceAccessControlAttributeConfigurationArgs(GetInstanceAccessControlAttributeConfigurationArgs $) {
        this.instanceArn = $.instanceArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceAccessControlAttributeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceAccessControlAttributeConfigurationArgs $;

        public Builder() {
            $ = new GetInstanceAccessControlAttributeConfigurationArgs();
        }

        public Builder(GetInstanceAccessControlAttributeConfigurationArgs defaults) {
            $ = new GetInstanceAccessControlAttributeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceArn The ARN of the AWS SSO instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(Output<String> instanceArn) {
            $.instanceArn = instanceArn;
            return this;
        }

        /**
         * @param instanceArn The ARN of the AWS SSO instance under which the operation will be executed.
         * 
         * @return builder
         * 
         */
        public Builder instanceArn(String instanceArn) {
            return instanceArn(Output.of(instanceArn));
        }

        public GetInstanceAccessControlAttributeConfigurationArgs build() {
            $.instanceArn = Objects.requireNonNull($.instanceArn, "expected parameter 'instanceArn' to be non-null");
            return $;
        }
    }

}
