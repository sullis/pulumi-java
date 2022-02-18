// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.intune;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IoMAMPolicyByNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final IoMAMPolicyByNameArgs Empty = new IoMAMPolicyByNameArgs();

    @InputImport(name="accessRecheckOfflineTimeout")
    private final @Nullable Input<String> accessRecheckOfflineTimeout;

    public Input<String> getAccessRecheckOfflineTimeout() {
        return this.accessRecheckOfflineTimeout == null ? Input.empty() : this.accessRecheckOfflineTimeout;
    }

    @InputImport(name="accessRecheckOnlineTimeout")
    private final @Nullable Input<String> accessRecheckOnlineTimeout;

    public Input<String> getAccessRecheckOnlineTimeout() {
        return this.accessRecheckOnlineTimeout == null ? Input.empty() : this.accessRecheckOnlineTimeout;
    }

    @InputImport(name="appSharingFromLevel")
    private final @Nullable Input<String> appSharingFromLevel;

    public Input<String> getAppSharingFromLevel() {
        return this.appSharingFromLevel == null ? Input.empty() : this.appSharingFromLevel;
    }

    @InputImport(name="appSharingToLevel")
    private final @Nullable Input<String> appSharingToLevel;

    public Input<String> getAppSharingToLevel() {
        return this.appSharingToLevel == null ? Input.empty() : this.appSharingToLevel;
    }

    @InputImport(name="authentication")
    private final @Nullable Input<String> authentication;

    public Input<String> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    @InputImport(name="clipboardSharingLevel")
    private final @Nullable Input<String> clipboardSharingLevel;

    public Input<String> getClipboardSharingLevel() {
        return this.clipboardSharingLevel == null ? Input.empty() : this.clipboardSharingLevel;
    }

    @InputImport(name="dataBackup")
    private final @Nullable Input<String> dataBackup;

    public Input<String> getDataBackup() {
        return this.dataBackup == null ? Input.empty() : this.dataBackup;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="deviceCompliance")
    private final @Nullable Input<String> deviceCompliance;

    public Input<String> getDeviceCompliance() {
        return this.deviceCompliance == null ? Input.empty() : this.deviceCompliance;
    }

    @InputImport(name="fileEncryptionLevel")
    private final @Nullable Input<String> fileEncryptionLevel;

    public Input<String> getFileEncryptionLevel() {
        return this.fileEncryptionLevel == null ? Input.empty() : this.fileEncryptionLevel;
    }

    @InputImport(name="fileSharingSaveAs")
    private final @Nullable Input<String> fileSharingSaveAs;

    public Input<String> getFileSharingSaveAs() {
        return this.fileSharingSaveAs == null ? Input.empty() : this.fileSharingSaveAs;
    }

    @InputImport(name="friendlyName", required=true)
    private final Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Location hostName for the tenant
     * 
     */
    @InputImport(name="hostName", required=true)
    private final Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName;
    }

    /**
     * Resource Location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="managedBrowser")
    private final @Nullable Input<String> managedBrowser;

    public Input<String> getManagedBrowser() {
        return this.managedBrowser == null ? Input.empty() : this.managedBrowser;
    }

    @InputImport(name="offlineWipeTimeout")
    private final @Nullable Input<String> offlineWipeTimeout;

    public Input<String> getOfflineWipeTimeout() {
        return this.offlineWipeTimeout == null ? Input.empty() : this.offlineWipeTimeout;
    }

    @InputImport(name="pin")
    private final @Nullable Input<String> pin;

    public Input<String> getPin() {
        return this.pin == null ? Input.empty() : this.pin;
    }

    @InputImport(name="pinNumRetry")
    private final @Nullable Input<Integer> pinNumRetry;

    public Input<Integer> getPinNumRetry() {
        return this.pinNumRetry == null ? Input.empty() : this.pinNumRetry;
    }

    /**
     * Unique name for the policy
     * 
     */
    @InputImport(name="policyName")
    private final @Nullable Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    /**
     * Resource Tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="touchId")
    private final @Nullable Input<String> touchId;

    public Input<String> getTouchId() {
        return this.touchId == null ? Input.empty() : this.touchId;
    }

    public IoMAMPolicyByNameArgs(
        @Nullable Input<String> accessRecheckOfflineTimeout,
        @Nullable Input<String> accessRecheckOnlineTimeout,
        @Nullable Input<String> appSharingFromLevel,
        @Nullable Input<String> appSharingToLevel,
        @Nullable Input<String> authentication,
        @Nullable Input<String> clipboardSharingLevel,
        @Nullable Input<String> dataBackup,
        @Nullable Input<String> description,
        @Nullable Input<String> deviceCompliance,
        @Nullable Input<String> fileEncryptionLevel,
        @Nullable Input<String> fileSharingSaveAs,
        Input<String> friendlyName,
        Input<String> hostName,
        @Nullable Input<String> location,
        @Nullable Input<String> managedBrowser,
        @Nullable Input<String> offlineWipeTimeout,
        @Nullable Input<String> pin,
        @Nullable Input<Integer> pinNumRetry,
        @Nullable Input<String> policyName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> touchId) {
        this.accessRecheckOfflineTimeout = accessRecheckOfflineTimeout;
        this.accessRecheckOnlineTimeout = accessRecheckOnlineTimeout;
        this.appSharingFromLevel = appSharingFromLevel == null ? Input.ofNullable("none") : appSharingFromLevel;
        this.appSharingToLevel = appSharingToLevel == null ? Input.ofNullable("none") : appSharingToLevel;
        this.authentication = authentication == null ? Input.ofNullable("required") : authentication;
        this.clipboardSharingLevel = clipboardSharingLevel == null ? Input.ofNullable("blocked") : clipboardSharingLevel;
        this.dataBackup = dataBackup == null ? Input.ofNullable("allow") : dataBackup;
        this.description = description;
        this.deviceCompliance = deviceCompliance == null ? Input.ofNullable("enable") : deviceCompliance;
        this.fileEncryptionLevel = fileEncryptionLevel == null ? Input.ofNullable("deviceLocked") : fileEncryptionLevel;
        this.fileSharingSaveAs = fileSharingSaveAs == null ? Input.ofNullable("allow") : fileSharingSaveAs;
        this.friendlyName = Objects.requireNonNull(friendlyName, "expected parameter 'friendlyName' to be non-null");
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.location = location;
        this.managedBrowser = managedBrowser == null ? Input.ofNullable("required") : managedBrowser;
        this.offlineWipeTimeout = offlineWipeTimeout;
        this.pin = pin == null ? Input.ofNullable("required") : pin;
        this.pinNumRetry = pinNumRetry;
        this.policyName = policyName;
        this.tags = tags;
        this.touchId = touchId == null ? Input.ofNullable("enable") : touchId;
    }

    private IoMAMPolicyByNameArgs() {
        this.accessRecheckOfflineTimeout = Input.empty();
        this.accessRecheckOnlineTimeout = Input.empty();
        this.appSharingFromLevel = Input.empty();
        this.appSharingToLevel = Input.empty();
        this.authentication = Input.empty();
        this.clipboardSharingLevel = Input.empty();
        this.dataBackup = Input.empty();
        this.description = Input.empty();
        this.deviceCompliance = Input.empty();
        this.fileEncryptionLevel = Input.empty();
        this.fileSharingSaveAs = Input.empty();
        this.friendlyName = Input.empty();
        this.hostName = Input.empty();
        this.location = Input.empty();
        this.managedBrowser = Input.empty();
        this.offlineWipeTimeout = Input.empty();
        this.pin = Input.empty();
        this.pinNumRetry = Input.empty();
        this.policyName = Input.empty();
        this.tags = Input.empty();
        this.touchId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IoMAMPolicyByNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessRecheckOfflineTimeout;
        private @Nullable Input<String> accessRecheckOnlineTimeout;
        private @Nullable Input<String> appSharingFromLevel;
        private @Nullable Input<String> appSharingToLevel;
        private @Nullable Input<String> authentication;
        private @Nullable Input<String> clipboardSharingLevel;
        private @Nullable Input<String> dataBackup;
        private @Nullable Input<String> description;
        private @Nullable Input<String> deviceCompliance;
        private @Nullable Input<String> fileEncryptionLevel;
        private @Nullable Input<String> fileSharingSaveAs;
        private Input<String> friendlyName;
        private Input<String> hostName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedBrowser;
        private @Nullable Input<String> offlineWipeTimeout;
        private @Nullable Input<String> pin;
        private @Nullable Input<Integer> pinNumRetry;
        private @Nullable Input<String> policyName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> touchId;

        public Builder() {
    	      // Empty
        }

        public Builder(IoMAMPolicyByNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRecheckOfflineTimeout = defaults.accessRecheckOfflineTimeout;
    	      this.accessRecheckOnlineTimeout = defaults.accessRecheckOnlineTimeout;
    	      this.appSharingFromLevel = defaults.appSharingFromLevel;
    	      this.appSharingToLevel = defaults.appSharingToLevel;
    	      this.authentication = defaults.authentication;
    	      this.clipboardSharingLevel = defaults.clipboardSharingLevel;
    	      this.dataBackup = defaults.dataBackup;
    	      this.description = defaults.description;
    	      this.deviceCompliance = defaults.deviceCompliance;
    	      this.fileEncryptionLevel = defaults.fileEncryptionLevel;
    	      this.fileSharingSaveAs = defaults.fileSharingSaveAs;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hostName = defaults.hostName;
    	      this.location = defaults.location;
    	      this.managedBrowser = defaults.managedBrowser;
    	      this.offlineWipeTimeout = defaults.offlineWipeTimeout;
    	      this.pin = defaults.pin;
    	      this.pinNumRetry = defaults.pinNumRetry;
    	      this.policyName = defaults.policyName;
    	      this.tags = defaults.tags;
    	      this.touchId = defaults.touchId;
        }

        public Builder setAccessRecheckOfflineTimeout(@Nullable Input<String> accessRecheckOfflineTimeout) {
            this.accessRecheckOfflineTimeout = accessRecheckOfflineTimeout;
            return this;
        }

        public Builder setAccessRecheckOfflineTimeout(@Nullable String accessRecheckOfflineTimeout) {
            this.accessRecheckOfflineTimeout = Input.ofNullable(accessRecheckOfflineTimeout);
            return this;
        }

        public Builder setAccessRecheckOnlineTimeout(@Nullable Input<String> accessRecheckOnlineTimeout) {
            this.accessRecheckOnlineTimeout = accessRecheckOnlineTimeout;
            return this;
        }

        public Builder setAccessRecheckOnlineTimeout(@Nullable String accessRecheckOnlineTimeout) {
            this.accessRecheckOnlineTimeout = Input.ofNullable(accessRecheckOnlineTimeout);
            return this;
        }

        public Builder setAppSharingFromLevel(@Nullable Input<String> appSharingFromLevel) {
            this.appSharingFromLevel = appSharingFromLevel;
            return this;
        }

        public Builder setAppSharingFromLevel(@Nullable String appSharingFromLevel) {
            this.appSharingFromLevel = Input.ofNullable(appSharingFromLevel);
            return this;
        }

        public Builder setAppSharingToLevel(@Nullable Input<String> appSharingToLevel) {
            this.appSharingToLevel = appSharingToLevel;
            return this;
        }

        public Builder setAppSharingToLevel(@Nullable String appSharingToLevel) {
            this.appSharingToLevel = Input.ofNullable(appSharingToLevel);
            return this;
        }

        public Builder setAuthentication(@Nullable Input<String> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable String authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder setClipboardSharingLevel(@Nullable Input<String> clipboardSharingLevel) {
            this.clipboardSharingLevel = clipboardSharingLevel;
            return this;
        }

        public Builder setClipboardSharingLevel(@Nullable String clipboardSharingLevel) {
            this.clipboardSharingLevel = Input.ofNullable(clipboardSharingLevel);
            return this;
        }

        public Builder setDataBackup(@Nullable Input<String> dataBackup) {
            this.dataBackup = dataBackup;
            return this;
        }

        public Builder setDataBackup(@Nullable String dataBackup) {
            this.dataBackup = Input.ofNullable(dataBackup);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDeviceCompliance(@Nullable Input<String> deviceCompliance) {
            this.deviceCompliance = deviceCompliance;
            return this;
        }

        public Builder setDeviceCompliance(@Nullable String deviceCompliance) {
            this.deviceCompliance = Input.ofNullable(deviceCompliance);
            return this;
        }

        public Builder setFileEncryptionLevel(@Nullable Input<String> fileEncryptionLevel) {
            this.fileEncryptionLevel = fileEncryptionLevel;
            return this;
        }

        public Builder setFileEncryptionLevel(@Nullable String fileEncryptionLevel) {
            this.fileEncryptionLevel = Input.ofNullable(fileEncryptionLevel);
            return this;
        }

        public Builder setFileSharingSaveAs(@Nullable Input<String> fileSharingSaveAs) {
            this.fileSharingSaveAs = fileSharingSaveAs;
            return this;
        }

        public Builder setFileSharingSaveAs(@Nullable String fileSharingSaveAs) {
            this.fileSharingSaveAs = Input.ofNullable(fileSharingSaveAs);
            return this;
        }

        public Builder setFriendlyName(Input<String> friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }

        public Builder setFriendlyName(String friendlyName) {
            this.friendlyName = Input.of(Objects.requireNonNull(friendlyName));
            return this;
        }

        public Builder setHostName(Input<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Input.of(Objects.requireNonNull(hostName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedBrowser(@Nullable Input<String> managedBrowser) {
            this.managedBrowser = managedBrowser;
            return this;
        }

        public Builder setManagedBrowser(@Nullable String managedBrowser) {
            this.managedBrowser = Input.ofNullable(managedBrowser);
            return this;
        }

        public Builder setOfflineWipeTimeout(@Nullable Input<String> offlineWipeTimeout) {
            this.offlineWipeTimeout = offlineWipeTimeout;
            return this;
        }

        public Builder setOfflineWipeTimeout(@Nullable String offlineWipeTimeout) {
            this.offlineWipeTimeout = Input.ofNullable(offlineWipeTimeout);
            return this;
        }

        public Builder setPin(@Nullable Input<String> pin) {
            this.pin = pin;
            return this;
        }

        public Builder setPin(@Nullable String pin) {
            this.pin = Input.ofNullable(pin);
            return this;
        }

        public Builder setPinNumRetry(@Nullable Input<Integer> pinNumRetry) {
            this.pinNumRetry = pinNumRetry;
            return this;
        }

        public Builder setPinNumRetry(@Nullable Integer pinNumRetry) {
            this.pinNumRetry = Input.ofNullable(pinNumRetry);
            return this;
        }

        public Builder setPolicyName(@Nullable Input<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTouchId(@Nullable Input<String> touchId) {
            this.touchId = touchId;
            return this;
        }

        public Builder setTouchId(@Nullable String touchId) {
            this.touchId = Input.ofNullable(touchId);
            return this;
        }

        public IoMAMPolicyByNameArgs build() {
            return new IoMAMPolicyByNameArgs(accessRecheckOfflineTimeout, accessRecheckOnlineTimeout, appSharingFromLevel, appSharingToLevel, authentication, clipboardSharingLevel, dataBackup, description, deviceCompliance, fileEncryptionLevel, fileSharingSaveAs, friendlyName, hostName, location, managedBrowser, offlineWipeTimeout, pin, pinNumRetry, policyName, tags, touchId);
        }
    }
}
