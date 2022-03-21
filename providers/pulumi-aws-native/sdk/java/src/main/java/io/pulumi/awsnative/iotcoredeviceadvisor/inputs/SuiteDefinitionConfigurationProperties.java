// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotcoredeviceadvisor.inputs;

import io.pulumi.awsnative.iotcoredeviceadvisor.inputs.SuiteDefinitionDeviceUnderTest;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SuiteDefinitionConfigurationProperties extends io.pulumi.resources.InvokeArgs {

    public static final SuiteDefinitionConfigurationProperties Empty = new SuiteDefinitionConfigurationProperties();

    @Import(name="devicePermissionRoleArn", required=true)
      private final String devicePermissionRoleArn;

    public String getDevicePermissionRoleArn() {
        return this.devicePermissionRoleArn;
    }

    @Import(name="devices")
      private final @Nullable List<SuiteDefinitionDeviceUnderTest> devices;

    public List<SuiteDefinitionDeviceUnderTest> getDevices() {
        return this.devices == null ? List.of() : this.devices;
    }

    @Import(name="intendedForQualification")
      private final @Nullable Boolean intendedForQualification;

    public Optional<Boolean> getIntendedForQualification() {
        return this.intendedForQualification == null ? Optional.empty() : Optional.ofNullable(this.intendedForQualification);
    }

    @Import(name="rootGroup", required=true)
      private final String rootGroup;

    public String getRootGroup() {
        return this.rootGroup;
    }

    @Import(name="suiteDefinitionName")
      private final @Nullable String suiteDefinitionName;

    public Optional<String> getSuiteDefinitionName() {
        return this.suiteDefinitionName == null ? Optional.empty() : Optional.ofNullable(this.suiteDefinitionName);
    }

    public SuiteDefinitionConfigurationProperties(
        String devicePermissionRoleArn,
        @Nullable List<SuiteDefinitionDeviceUnderTest> devices,
        @Nullable Boolean intendedForQualification,
        String rootGroup,
        @Nullable String suiteDefinitionName) {
        this.devicePermissionRoleArn = Objects.requireNonNull(devicePermissionRoleArn, "expected parameter 'devicePermissionRoleArn' to be non-null");
        this.devices = devices;
        this.intendedForQualification = intendedForQualification;
        this.rootGroup = Objects.requireNonNull(rootGroup, "expected parameter 'rootGroup' to be non-null");
        this.suiteDefinitionName = suiteDefinitionName;
    }

    private SuiteDefinitionConfigurationProperties() {
        this.devicePermissionRoleArn = null;
        this.devices = List.of();
        this.intendedForQualification = null;
        this.rootGroup = null;
        this.suiteDefinitionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuiteDefinitionConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String devicePermissionRoleArn;
        private @Nullable List<SuiteDefinitionDeviceUnderTest> devices;
        private @Nullable Boolean intendedForQualification;
        private String rootGroup;
        private @Nullable String suiteDefinitionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SuiteDefinitionConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePermissionRoleArn = defaults.devicePermissionRoleArn;
    	      this.devices = defaults.devices;
    	      this.intendedForQualification = defaults.intendedForQualification;
    	      this.rootGroup = defaults.rootGroup;
    	      this.suiteDefinitionName = defaults.suiteDefinitionName;
        }

        public Builder devicePermissionRoleArn(String devicePermissionRoleArn) {
            this.devicePermissionRoleArn = Objects.requireNonNull(devicePermissionRoleArn);
            return this;
        }
        public Builder devices(@Nullable List<SuiteDefinitionDeviceUnderTest> devices) {
            this.devices = devices;
            return this;
        }
        public Builder devices(SuiteDefinitionDeviceUnderTest... devices) {
            return devices(List.of(devices));
        }
        public Builder intendedForQualification(@Nullable Boolean intendedForQualification) {
            this.intendedForQualification = intendedForQualification;
            return this;
        }
        public Builder rootGroup(String rootGroup) {
            this.rootGroup = Objects.requireNonNull(rootGroup);
            return this;
        }
        public Builder suiteDefinitionName(@Nullable String suiteDefinitionName) {
            this.suiteDefinitionName = suiteDefinitionName;
            return this;
        }        public SuiteDefinitionConfigurationProperties build() {
            return new SuiteDefinitionConfigurationProperties(devicePermissionRoleArn, devices, intendedForQualification, rootGroup, suiteDefinitionName);
        }
    }
}
