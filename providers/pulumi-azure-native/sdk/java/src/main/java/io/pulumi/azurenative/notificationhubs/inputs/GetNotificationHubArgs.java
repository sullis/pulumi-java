// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationHubArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNotificationHubArgs Empty = new GetNotificationHubArgs();

    /**
     * The namespace name.
     * 
     */
    @Import(name="namespaceName", required=true)
      private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * The notification hub name.
     * 
     */
    @Import(name="notificationHubName", required=true)
      private final String notificationHubName;

    public String getNotificationHubName() {
        return this.notificationHubName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNotificationHubArgs(
        String namespaceName,
        String notificationHubName,
        String resourceGroupName) {
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.notificationHubName = Objects.requireNonNull(notificationHubName, "expected parameter 'notificationHubName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNotificationHubArgs() {
        this.namespaceName = null;
        this.notificationHubName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespaceName;
        private String notificationHubName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceName = defaults.namespaceName;
    	      this.notificationHubName = defaults.notificationHubName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder notificationHubName(String notificationHubName) {
            this.notificationHubName = Objects.requireNonNull(notificationHubName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetNotificationHubArgs build() {
            return new GetNotificationHubArgs(namespaceName, notificationHubName, resourceGroupName);
        }
    }
}
