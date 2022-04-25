// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.inputs;

import com.pulumi.azurenative.solutions.inputs.ApplicationNotificationEndpointArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Managed application notification policy.
 * 
 */
public final class ApplicationNotificationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationNotificationPolicyArgs Empty = new ApplicationNotificationPolicyArgs();

    /**
     * The managed application notification endpoint.
     * 
     */
    @Import(name="notificationEndpoints", required=true)
    private Output<List<ApplicationNotificationEndpointArgs>> notificationEndpoints;

    /**
     * @return The managed application notification endpoint.
     * 
     */
    public Output<List<ApplicationNotificationEndpointArgs>> notificationEndpoints() {
        return this.notificationEndpoints;
    }

    private ApplicationNotificationPolicyArgs() {}

    private ApplicationNotificationPolicyArgs(ApplicationNotificationPolicyArgs $) {
        this.notificationEndpoints = $.notificationEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationNotificationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationNotificationPolicyArgs $;

        public Builder() {
            $ = new ApplicationNotificationPolicyArgs();
        }

        public Builder(ApplicationNotificationPolicyArgs defaults) {
            $ = new ApplicationNotificationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param notificationEndpoints The managed application notification endpoint.
         * 
         * @return builder
         * 
         */
        public Builder notificationEndpoints(Output<List<ApplicationNotificationEndpointArgs>> notificationEndpoints) {
            $.notificationEndpoints = notificationEndpoints;
            return this;
        }

        /**
         * @param notificationEndpoints The managed application notification endpoint.
         * 
         * @return builder
         * 
         */
        public Builder notificationEndpoints(List<ApplicationNotificationEndpointArgs> notificationEndpoints) {
            return notificationEndpoints(Output.of(notificationEndpoints));
        }

        /**
         * @param notificationEndpoints The managed application notification endpoint.
         * 
         * @return builder
         * 
         */
        public Builder notificationEndpoints(ApplicationNotificationEndpointArgs... notificationEndpoints) {
            return notificationEndpoints(List.of(notificationEndpoints));
        }

        public ApplicationNotificationPolicyArgs build() {
            $.notificationEndpoints = Objects.requireNonNull($.notificationEndpoints, "expected parameter 'notificationEndpoints' to be non-null");
            return $;
        }
    }

}
