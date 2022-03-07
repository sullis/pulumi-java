// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AdvancedThreatProtectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdvancedThreatProtectionArgs Empty = new AdvancedThreatProtectionArgs();

    /**
     * Indicates whether Advanced Threat Protection is enabled.
     * 
     */
    @InputImport(name="isEnabled")
      private final @Nullable Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Input.empty() : this.isEnabled;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @InputImport(name="resourceId", required=true)
      private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * Advanced Threat Protection setting name.
     * 
     */
    @InputImport(name="settingName")
      private final @Nullable Input<String> settingName;

    public Input<String> getSettingName() {
        return this.settingName == null ? Input.empty() : this.settingName;
    }

    public AdvancedThreatProtectionArgs(
        @Nullable Input<Boolean> isEnabled,
        Input<String> resourceId,
        @Nullable Input<String> settingName) {
        this.isEnabled = isEnabled;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.settingName = settingName;
    }

    private AdvancedThreatProtectionArgs() {
        this.isEnabled = Input.empty();
        this.resourceId = Input.empty();
        this.settingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedThreatProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isEnabled;
        private Input<String> resourceId;
        private @Nullable Input<String> settingName;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedThreatProtectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.resourceId = defaults.resourceId;
    	      this.settingName = defaults.settingName;
        }

        public Builder setIsEnabled(@Nullable Input<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Input.ofNullable(isEnabled);
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public Builder setSettingName(@Nullable Input<String> settingName) {
            this.settingName = settingName;
            return this;
        }

        public Builder setSettingName(@Nullable String settingName) {
            this.settingName = Input.ofNullable(settingName);
            return this;
        }
        public AdvancedThreatProtectionArgs build() {
            return new AdvancedThreatProtectionArgs(isEnabled, resourceId, settingName);
        }
    }
}