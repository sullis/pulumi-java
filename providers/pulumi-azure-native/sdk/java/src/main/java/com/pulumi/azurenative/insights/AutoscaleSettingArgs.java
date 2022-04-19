// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.inputs.AutoscaleNotificationArgs;
import com.pulumi.azurenative.insights.inputs.AutoscaleProfileArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscaleSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscaleSettingArgs Empty = new AutoscaleSettingArgs();

    /**
     * The autoscale setting name.
     * 
     */
    @Import(name="autoscaleSettingName")
      private final @Nullable Output<String> autoscaleSettingName;

    public Output<String> autoscaleSettingName() {
        return this.autoscaleSettingName == null ? Codegen.empty() : this.autoscaleSettingName;
    }

    /**
     * the enabled flag. Specifies whether automatic scaling is enabled for the resource. The default value is 'true'.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * the name of the autoscale setting.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * the collection of notifications.
     * 
     */
    @Import(name="notifications")
      private final @Nullable Output<List<AutoscaleNotificationArgs>> notifications;

    public Output<List<AutoscaleNotificationArgs>> notifications() {
        return this.notifications == null ? Codegen.empty() : this.notifications;
    }

    /**
     * the collection of automatic scaling profiles that specify different scaling parameters for different time periods. A maximum of 20 profiles can be specified.
     * 
     */
    @Import(name="profiles", required=true)
      private final Output<List<AutoscaleProfileArgs>> profiles;

    public Output<List<AutoscaleProfileArgs>> profiles() {
        return this.profiles;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * the location of the resource that the autoscale setting should be added to.
     * 
     */
    @Import(name="targetResourceLocation")
      private final @Nullable Output<String> targetResourceLocation;

    public Output<String> targetResourceLocation() {
        return this.targetResourceLocation == null ? Codegen.empty() : this.targetResourceLocation;
    }

    /**
     * the resource identifier of the resource that the autoscale setting should be added to.
     * 
     */
    @Import(name="targetResourceUri")
      private final @Nullable Output<String> targetResourceUri;

    public Output<String> targetResourceUri() {
        return this.targetResourceUri == null ? Codegen.empty() : this.targetResourceUri;
    }

    public AutoscaleSettingArgs(
        @Nullable Output<String> autoscaleSettingName,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<List<AutoscaleNotificationArgs>> notifications,
        Output<List<AutoscaleProfileArgs>> profiles,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> targetResourceLocation,
        @Nullable Output<String> targetResourceUri) {
        this.autoscaleSettingName = autoscaleSettingName;
        this.enabled = Codegen.booleanProp("enabled").output().arg(enabled).def(true).getNullable();
        this.location = location;
        this.name = name;
        this.notifications = notifications;
        this.profiles = Objects.requireNonNull(profiles, "expected parameter 'profiles' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.targetResourceLocation = targetResourceLocation;
        this.targetResourceUri = targetResourceUri;
    }

    private AutoscaleSettingArgs() {
        this.autoscaleSettingName = Codegen.empty();
        this.enabled = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.notifications = Codegen.empty();
        this.profiles = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.targetResourceLocation = Codegen.empty();
        this.targetResourceUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoscaleSettingName;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<List<AutoscaleNotificationArgs>> notifications;
        private Output<List<AutoscaleProfileArgs>> profiles;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> targetResourceLocation;
        private @Nullable Output<String> targetResourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleSettingName = defaults.autoscaleSettingName;
    	      this.enabled = defaults.enabled;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.profiles = defaults.profiles;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.targetResourceLocation = defaults.targetResourceLocation;
    	      this.targetResourceUri = defaults.targetResourceUri;
        }

        public Builder autoscaleSettingName(@Nullable Output<String> autoscaleSettingName) {
            this.autoscaleSettingName = autoscaleSettingName;
            return this;
        }
        public Builder autoscaleSettingName(@Nullable String autoscaleSettingName) {
            this.autoscaleSettingName = Codegen.ofNullable(autoscaleSettingName);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notifications(@Nullable Output<List<AutoscaleNotificationArgs>> notifications) {
            this.notifications = notifications;
            return this;
        }
        public Builder notifications(@Nullable List<AutoscaleNotificationArgs> notifications) {
            this.notifications = Codegen.ofNullable(notifications);
            return this;
        }
        public Builder notifications(AutoscaleNotificationArgs... notifications) {
            return notifications(List.of(notifications));
        }
        public Builder profiles(Output<List<AutoscaleProfileArgs>> profiles) {
            this.profiles = Objects.requireNonNull(profiles);
            return this;
        }
        public Builder profiles(List<AutoscaleProfileArgs> profiles) {
            this.profiles = Output.of(Objects.requireNonNull(profiles));
            return this;
        }
        public Builder profiles(AutoscaleProfileArgs... profiles) {
            return profiles(List.of(profiles));
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder targetResourceLocation(@Nullable Output<String> targetResourceLocation) {
            this.targetResourceLocation = targetResourceLocation;
            return this;
        }
        public Builder targetResourceLocation(@Nullable String targetResourceLocation) {
            this.targetResourceLocation = Codegen.ofNullable(targetResourceLocation);
            return this;
        }
        public Builder targetResourceUri(@Nullable Output<String> targetResourceUri) {
            this.targetResourceUri = targetResourceUri;
            return this;
        }
        public Builder targetResourceUri(@Nullable String targetResourceUri) {
            this.targetResourceUri = Codegen.ofNullable(targetResourceUri);
            return this;
        }        public AutoscaleSettingArgs build() {
            return new AutoscaleSettingArgs(autoscaleSettingName, enabled, location, name, notifications, profiles, resourceGroupName, tags, targetResourceLocation, targetResourceUri);
        }
    }
}
