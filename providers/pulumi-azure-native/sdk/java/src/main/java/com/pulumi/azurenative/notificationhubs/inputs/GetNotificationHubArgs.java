// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.notificationhubs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationHubArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationHubArgs Empty = new GetNotificationHubArgs();

    /**
     * The namespace name.
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The namespace name.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * The notification hub name.
     * 
     */
    @Import(name="notificationHubName", required=true)
    private String notificationHubName;

    /**
     * @return The notification hub name.
     * 
     */
    public String notificationHubName() {
        return this.notificationHubName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNotificationHubArgs() {}

    private GetNotificationHubArgs(GetNotificationHubArgs $) {
        this.namespaceName = $.namespaceName;
        this.notificationHubName = $.notificationHubName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationHubArgs $;

        public Builder() {
            $ = new GetNotificationHubArgs();
        }

        public Builder(GetNotificationHubArgs defaults) {
            $ = new GetNotificationHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespaceName The namespace name.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param notificationHubName The notification hub name.
         * 
         * @return builder
         * 
         */
        public Builder notificationHubName(String notificationHubName) {
            $.notificationHubName = notificationHubName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNotificationHubArgs build() {
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.notificationHubName = Objects.requireNonNull($.notificationHubName, "expected parameter 'notificationHubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
