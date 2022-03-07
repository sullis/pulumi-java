// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opsworkscm;

import io.pulumi.awsnative.opsworkscm.inputs.ServerEngineAttributeArgs;
import io.pulumi.awsnative.opsworkscm.inputs.ServerTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerArgs Empty = new ServerArgs();

    @InputImport(name="associatePublicIpAddress")
      private final @Nullable Input<Boolean> associatePublicIpAddress;

    public Input<Boolean> getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress == null ? Input.empty() : this.associatePublicIpAddress;
    }

    @InputImport(name="backupId")
      private final @Nullable Input<String> backupId;

    public Input<String> getBackupId() {
        return this.backupId == null ? Input.empty() : this.backupId;
    }

    @InputImport(name="backupRetentionCount")
      private final @Nullable Input<Integer> backupRetentionCount;

    public Input<Integer> getBackupRetentionCount() {
        return this.backupRetentionCount == null ? Input.empty() : this.backupRetentionCount;
    }

    @InputImport(name="customCertificate")
      private final @Nullable Input<String> customCertificate;

    public Input<String> getCustomCertificate() {
        return this.customCertificate == null ? Input.empty() : this.customCertificate;
    }

    @InputImport(name="customDomain")
      private final @Nullable Input<String> customDomain;

    public Input<String> getCustomDomain() {
        return this.customDomain == null ? Input.empty() : this.customDomain;
    }

    @InputImport(name="customPrivateKey")
      private final @Nullable Input<String> customPrivateKey;

    public Input<String> getCustomPrivateKey() {
        return this.customPrivateKey == null ? Input.empty() : this.customPrivateKey;
    }

    @InputImport(name="disableAutomatedBackup")
      private final @Nullable Input<Boolean> disableAutomatedBackup;

    public Input<Boolean> getDisableAutomatedBackup() {
        return this.disableAutomatedBackup == null ? Input.empty() : this.disableAutomatedBackup;
    }

    @InputImport(name="engine")
      private final @Nullable Input<String> engine;

    public Input<String> getEngine() {
        return this.engine == null ? Input.empty() : this.engine;
    }

    @InputImport(name="engineAttributes")
      private final @Nullable Input<List<ServerEngineAttributeArgs>> engineAttributes;

    public Input<List<ServerEngineAttributeArgs>> getEngineAttributes() {
        return this.engineAttributes == null ? Input.empty() : this.engineAttributes;
    }

    @InputImport(name="engineModel")
      private final @Nullable Input<String> engineModel;

    public Input<String> getEngineModel() {
        return this.engineModel == null ? Input.empty() : this.engineModel;
    }

    @InputImport(name="engineVersion")
      private final @Nullable Input<String> engineVersion;

    public Input<String> getEngineVersion() {
        return this.engineVersion == null ? Input.empty() : this.engineVersion;
    }

    @InputImport(name="instanceProfileArn", required=true)
      private final Input<String> instanceProfileArn;

    public Input<String> getInstanceProfileArn() {
        return this.instanceProfileArn;
    }

    @InputImport(name="instanceType", required=true)
      private final Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType;
    }

    @InputImport(name="keyPair")
      private final @Nullable Input<String> keyPair;

    public Input<String> getKeyPair() {
        return this.keyPair == null ? Input.empty() : this.keyPair;
    }

    @InputImport(name="preferredBackupWindow")
      private final @Nullable Input<String> preferredBackupWindow;

    public Input<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow == null ? Input.empty() : this.preferredBackupWindow;
    }

    @InputImport(name="preferredMaintenanceWindow")
      private final @Nullable Input<String> preferredMaintenanceWindow;

    public Input<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Input.empty() : this.preferredMaintenanceWindow;
    }

    @InputImport(name="securityGroupIds")
      private final @Nullable Input<List<String>> securityGroupIds;

    public Input<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Input.empty() : this.securityGroupIds;
    }

    @InputImport(name="serverName")
      private final @Nullable Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName == null ? Input.empty() : this.serverName;
    }

    @InputImport(name="serviceRoleArn", required=true)
      private final Input<String> serviceRoleArn;

    public Input<String> getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    @InputImport(name="subnetIds")
      private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<ServerTagArgs>> tags;

    public Input<List<ServerTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServerArgs(
        @Nullable Input<Boolean> associatePublicIpAddress,
        @Nullable Input<String> backupId,
        @Nullable Input<Integer> backupRetentionCount,
        @Nullable Input<String> customCertificate,
        @Nullable Input<String> customDomain,
        @Nullable Input<String> customPrivateKey,
        @Nullable Input<Boolean> disableAutomatedBackup,
        @Nullable Input<String> engine,
        @Nullable Input<List<ServerEngineAttributeArgs>> engineAttributes,
        @Nullable Input<String> engineModel,
        @Nullable Input<String> engineVersion,
        Input<String> instanceProfileArn,
        Input<String> instanceType,
        @Nullable Input<String> keyPair,
        @Nullable Input<String> preferredBackupWindow,
        @Nullable Input<String> preferredMaintenanceWindow,
        @Nullable Input<List<String>> securityGroupIds,
        @Nullable Input<String> serverName,
        Input<String> serviceRoleArn,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<List<ServerTagArgs>> tags) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.backupId = backupId;
        this.backupRetentionCount = backupRetentionCount;
        this.customCertificate = customCertificate;
        this.customDomain = customDomain;
        this.customPrivateKey = customPrivateKey;
        this.disableAutomatedBackup = disableAutomatedBackup;
        this.engine = engine;
        this.engineAttributes = engineAttributes;
        this.engineModel = engineModel;
        this.engineVersion = engineVersion;
        this.instanceProfileArn = Objects.requireNonNull(instanceProfileArn, "expected parameter 'instanceProfileArn' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.keyPair = keyPair;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.securityGroupIds = securityGroupIds;
        this.serverName = serverName;
        this.serviceRoleArn = Objects.requireNonNull(serviceRoleArn, "expected parameter 'serviceRoleArn' to be non-null");
        this.subnetIds = subnetIds;
        this.tags = tags;
    }

    private ServerArgs() {
        this.associatePublicIpAddress = Input.empty();
        this.backupId = Input.empty();
        this.backupRetentionCount = Input.empty();
        this.customCertificate = Input.empty();
        this.customDomain = Input.empty();
        this.customPrivateKey = Input.empty();
        this.disableAutomatedBackup = Input.empty();
        this.engine = Input.empty();
        this.engineAttributes = Input.empty();
        this.engineModel = Input.empty();
        this.engineVersion = Input.empty();
        this.instanceProfileArn = Input.empty();
        this.instanceType = Input.empty();
        this.keyPair = Input.empty();
        this.preferredBackupWindow = Input.empty();
        this.preferredMaintenanceWindow = Input.empty();
        this.securityGroupIds = Input.empty();
        this.serverName = Input.empty();
        this.serviceRoleArn = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> associatePublicIpAddress;
        private @Nullable Input<String> backupId;
        private @Nullable Input<Integer> backupRetentionCount;
        private @Nullable Input<String> customCertificate;
        private @Nullable Input<String> customDomain;
        private @Nullable Input<String> customPrivateKey;
        private @Nullable Input<Boolean> disableAutomatedBackup;
        private @Nullable Input<String> engine;
        private @Nullable Input<List<ServerEngineAttributeArgs>> engineAttributes;
        private @Nullable Input<String> engineModel;
        private @Nullable Input<String> engineVersion;
        private Input<String> instanceProfileArn;
        private Input<String> instanceType;
        private @Nullable Input<String> keyPair;
        private @Nullable Input<String> preferredBackupWindow;
        private @Nullable Input<String> preferredMaintenanceWindow;
        private @Nullable Input<List<String>> securityGroupIds;
        private @Nullable Input<String> serverName;
        private Input<String> serviceRoleArn;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<List<ServerTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.backupId = defaults.backupId;
    	      this.backupRetentionCount = defaults.backupRetentionCount;
    	      this.customCertificate = defaults.customCertificate;
    	      this.customDomain = defaults.customDomain;
    	      this.customPrivateKey = defaults.customPrivateKey;
    	      this.disableAutomatedBackup = defaults.disableAutomatedBackup;
    	      this.engine = defaults.engine;
    	      this.engineAttributes = defaults.engineAttributes;
    	      this.engineModel = defaults.engineModel;
    	      this.engineVersion = defaults.engineVersion;
    	      this.instanceProfileArn = defaults.instanceProfileArn;
    	      this.instanceType = defaults.instanceType;
    	      this.keyPair = defaults.keyPair;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.serverName = defaults.serverName;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Input<Boolean> associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Input.ofNullable(associatePublicIpAddress);
            return this;
        }

        public Builder setBackupId(@Nullable Input<String> backupId) {
            this.backupId = backupId;
            return this;
        }

        public Builder setBackupId(@Nullable String backupId) {
            this.backupId = Input.ofNullable(backupId);
            return this;
        }

        public Builder setBackupRetentionCount(@Nullable Input<Integer> backupRetentionCount) {
            this.backupRetentionCount = backupRetentionCount;
            return this;
        }

        public Builder setBackupRetentionCount(@Nullable Integer backupRetentionCount) {
            this.backupRetentionCount = Input.ofNullable(backupRetentionCount);
            return this;
        }

        public Builder setCustomCertificate(@Nullable Input<String> customCertificate) {
            this.customCertificate = customCertificate;
            return this;
        }

        public Builder setCustomCertificate(@Nullable String customCertificate) {
            this.customCertificate = Input.ofNullable(customCertificate);
            return this;
        }

        public Builder setCustomDomain(@Nullable Input<String> customDomain) {
            this.customDomain = customDomain;
            return this;
        }

        public Builder setCustomDomain(@Nullable String customDomain) {
            this.customDomain = Input.ofNullable(customDomain);
            return this;
        }

        public Builder setCustomPrivateKey(@Nullable Input<String> customPrivateKey) {
            this.customPrivateKey = customPrivateKey;
            return this;
        }

        public Builder setCustomPrivateKey(@Nullable String customPrivateKey) {
            this.customPrivateKey = Input.ofNullable(customPrivateKey);
            return this;
        }

        public Builder setDisableAutomatedBackup(@Nullable Input<Boolean> disableAutomatedBackup) {
            this.disableAutomatedBackup = disableAutomatedBackup;
            return this;
        }

        public Builder setDisableAutomatedBackup(@Nullable Boolean disableAutomatedBackup) {
            this.disableAutomatedBackup = Input.ofNullable(disableAutomatedBackup);
            return this;
        }

        public Builder setEngine(@Nullable Input<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder setEngine(@Nullable String engine) {
            this.engine = Input.ofNullable(engine);
            return this;
        }

        public Builder setEngineAttributes(@Nullable Input<List<ServerEngineAttributeArgs>> engineAttributes) {
            this.engineAttributes = engineAttributes;
            return this;
        }

        public Builder setEngineAttributes(@Nullable List<ServerEngineAttributeArgs> engineAttributes) {
            this.engineAttributes = Input.ofNullable(engineAttributes);
            return this;
        }

        public Builder setEngineModel(@Nullable Input<String> engineModel) {
            this.engineModel = engineModel;
            return this;
        }

        public Builder setEngineModel(@Nullable String engineModel) {
            this.engineModel = Input.ofNullable(engineModel);
            return this;
        }

        public Builder setEngineVersion(@Nullable Input<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setEngineVersion(@Nullable String engineVersion) {
            this.engineVersion = Input.ofNullable(engineVersion);
            return this;
        }

        public Builder setInstanceProfileArn(Input<String> instanceProfileArn) {
            this.instanceProfileArn = Objects.requireNonNull(instanceProfileArn);
            return this;
        }

        public Builder setInstanceProfileArn(String instanceProfileArn) {
            this.instanceProfileArn = Input.of(Objects.requireNonNull(instanceProfileArn));
            return this;
        }

        public Builder setInstanceType(Input<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Input.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder setKeyPair(@Nullable Input<String> keyPair) {
            this.keyPair = keyPair;
            return this;
        }

        public Builder setKeyPair(@Nullable String keyPair) {
            this.keyPair = Input.ofNullable(keyPair);
            return this;
        }

        public Builder setPreferredBackupWindow(@Nullable Input<String> preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        public Builder setPreferredBackupWindow(@Nullable String preferredBackupWindow) {
            this.preferredBackupWindow = Input.ofNullable(preferredBackupWindow);
            return this;
        }

        public Builder setPreferredMaintenanceWindow(@Nullable Input<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        public Builder setPreferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Input.ofNullable(preferredMaintenanceWindow);
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable Input<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Input.ofNullable(securityGroupIds);
            return this;
        }

        public Builder setServerName(@Nullable Input<String> serverName) {
            this.serverName = serverName;
            return this;
        }

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = Input.ofNullable(serverName);
            return this;
        }

        public Builder setServiceRoleArn(Input<String> serviceRoleArn) {
            this.serviceRoleArn = Objects.requireNonNull(serviceRoleArn);
            return this;
        }

        public Builder setServiceRoleArn(String serviceRoleArn) {
            this.serviceRoleArn = Input.of(Objects.requireNonNull(serviceRoleArn));
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ServerTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ServerTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ServerArgs build() {
            return new ServerArgs(associatePublicIpAddress, backupId, backupRetentionCount, customCertificate, customDomain, customPrivateKey, disableAutomatedBackup, engine, engineAttributes, engineModel, engineVersion, instanceProfileArn, instanceType, keyPair, preferredBackupWindow, preferredMaintenanceWindow, securityGroupIds, serverName, serviceRoleArn, subnetIds, tags);
        }
    }
}