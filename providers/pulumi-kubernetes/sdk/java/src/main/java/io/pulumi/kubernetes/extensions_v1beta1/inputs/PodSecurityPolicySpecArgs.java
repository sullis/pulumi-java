// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.AllowedCSIDriverArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.AllowedFlexVolumeArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.AllowedHostPathArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.FSGroupStrategyOptionsArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.HostPortRangeArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.RunAsGroupStrategyOptionsArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.RunAsUserStrategyOptionsArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.RuntimeClassStrategyOptionsArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.SELinuxStrategyOptionsArgs;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.SupplementalGroupsStrategyOptionsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodSecurityPolicySpec defines the policy enforced. Deprecated: use PodSecurityPolicySpec from policy API Group instead.
 * 
 */
public final class PodSecurityPolicySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodSecurityPolicySpecArgs Empty = new PodSecurityPolicySpecArgs();

    /**
     * allowPrivilegeEscalation determines if a pod can request to allow privilege escalation. If unspecified, defaults to true.
     * 
     */
    @Import(name="allowPrivilegeEscalation")
      private final @Nullable Output<Boolean> allowPrivilegeEscalation;

    public Output<Boolean> getAllowPrivilegeEscalation() {
        return this.allowPrivilegeEscalation == null ? Output.empty() : this.allowPrivilegeEscalation;
    }

    /**
     * AllowedCSIDrivers is a whitelist of inline CSI drivers that must be explicitly set to be embedded within a pod spec. An empty value indicates that any CSI driver can be used for inline ephemeral volumes.
     * 
     */
    @Import(name="allowedCSIDrivers")
      private final @Nullable Output<List<AllowedCSIDriverArgs>> allowedCSIDrivers;

    public Output<List<AllowedCSIDriverArgs>> getAllowedCSIDrivers() {
        return this.allowedCSIDrivers == null ? Output.empty() : this.allowedCSIDrivers;
    }

    /**
     * allowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author's discretion. You must not list a capability in both allowedCapabilities and requiredDropCapabilities.
     * 
     */
    @Import(name="allowedCapabilities")
      private final @Nullable Output<List<String>> allowedCapabilities;

    public Output<List<String>> getAllowedCapabilities() {
        return this.allowedCapabilities == null ? Output.empty() : this.allowedCapabilities;
    }

    /**
     * allowedFlexVolumes is a whitelist of allowed Flexvolumes.  Empty or nil indicates that all Flexvolumes may be used.  This parameter is effective only when the usage of the Flexvolumes is allowed in the "volumes" field.
     * 
     */
    @Import(name="allowedFlexVolumes")
      private final @Nullable Output<List<AllowedFlexVolumeArgs>> allowedFlexVolumes;

    public Output<List<AllowedFlexVolumeArgs>> getAllowedFlexVolumes() {
        return this.allowedFlexVolumes == null ? Output.empty() : this.allowedFlexVolumes;
    }

    /**
     * allowedHostPaths is a white list of allowed host paths. Empty indicates that all host paths may be used.
     * 
     */
    @Import(name="allowedHostPaths")
      private final @Nullable Output<List<AllowedHostPathArgs>> allowedHostPaths;

    public Output<List<AllowedHostPathArgs>> getAllowedHostPaths() {
        return this.allowedHostPaths == null ? Output.empty() : this.allowedHostPaths;
    }

    /**
     * AllowedProcMountTypes is a whitelist of allowed ProcMountTypes. Empty or nil indicates that only the DefaultProcMountType may be used. This requires the ProcMountType feature flag to be enabled.
     * 
     */
    @Import(name="allowedProcMountTypes")
      private final @Nullable Output<List<String>> allowedProcMountTypes;

    public Output<List<String>> getAllowedProcMountTypes() {
        return this.allowedProcMountTypes == null ? Output.empty() : this.allowedProcMountTypes;
    }

    /**
     * allowedUnsafeSysctls is a list of explicitly allowed unsafe sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of allowed sysctls. Single * means all unsafe sysctls are allowed. Kubelet has to whitelist all allowed unsafe sysctls explicitly to avoid rejection.
     * 
     * Examples: e.g. "foo/*" allows "foo/bar", "foo/baz", etc. e.g. "foo.*" allows "foo.bar", "foo.baz", etc.
     * 
     */
    @Import(name="allowedUnsafeSysctls")
      private final @Nullable Output<List<String>> allowedUnsafeSysctls;

    public Output<List<String>> getAllowedUnsafeSysctls() {
        return this.allowedUnsafeSysctls == null ? Output.empty() : this.allowedUnsafeSysctls;
    }

    /**
     * defaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capability in both defaultAddCapabilities and requiredDropCapabilities. Capabilities added here are implicitly allowed, and need not be included in the allowedCapabilities list.
     * 
     */
    @Import(name="defaultAddCapabilities")
      private final @Nullable Output<List<String>> defaultAddCapabilities;

    public Output<List<String>> getDefaultAddCapabilities() {
        return this.defaultAddCapabilities == null ? Output.empty() : this.defaultAddCapabilities;
    }

    /**
     * defaultAllowPrivilegeEscalation controls the default setting for whether a process can gain more privileges than its parent process.
     * 
     */
    @Import(name="defaultAllowPrivilegeEscalation")
      private final @Nullable Output<Boolean> defaultAllowPrivilegeEscalation;

    public Output<Boolean> getDefaultAllowPrivilegeEscalation() {
        return this.defaultAllowPrivilegeEscalation == null ? Output.empty() : this.defaultAllowPrivilegeEscalation;
    }

    /**
     * forbiddenSysctls is a list of explicitly forbidden sysctls, defaults to none. Each entry is either a plain sysctl name or ends in "*" in which case it is considered as a prefix of forbidden sysctls. Single * means all sysctls are forbidden.
     * 
     * Examples: e.g. "foo/*" forbids "foo/bar", "foo/baz", etc. e.g. "foo.*" forbids "foo.bar", "foo.baz", etc.
     * 
     */
    @Import(name="forbiddenSysctls")
      private final @Nullable Output<List<String>> forbiddenSysctls;

    public Output<List<String>> getForbiddenSysctls() {
        return this.forbiddenSysctls == null ? Output.empty() : this.forbiddenSysctls;
    }

    /**
     * fsGroup is the strategy that will dictate what fs group is used by the SecurityContext.
     * 
     */
    @Import(name="fsGroup", required=true)
      private final Output<FSGroupStrategyOptionsArgs> fsGroup;

    public Output<FSGroupStrategyOptionsArgs> getFsGroup() {
        return this.fsGroup;
    }

    /**
     * hostIPC determines if the policy allows the use of HostIPC in the pod spec.
     * 
     */
    @Import(name="hostIPC")
      private final @Nullable Output<Boolean> hostIPC;

    public Output<Boolean> getHostIPC() {
        return this.hostIPC == null ? Output.empty() : this.hostIPC;
    }

    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in the pod spec.
     * 
     */
    @Import(name="hostNetwork")
      private final @Nullable Output<Boolean> hostNetwork;

    public Output<Boolean> getHostNetwork() {
        return this.hostNetwork == null ? Output.empty() : this.hostNetwork;
    }

    /**
     * hostPID determines if the policy allows the use of HostPID in the pod spec.
     * 
     */
    @Import(name="hostPID")
      private final @Nullable Output<Boolean> hostPID;

    public Output<Boolean> getHostPID() {
        return this.hostPID == null ? Output.empty() : this.hostPID;
    }

    /**
     * hostPorts determines which host port ranges are allowed to be exposed.
     * 
     */
    @Import(name="hostPorts")
      private final @Nullable Output<List<HostPortRangeArgs>> hostPorts;

    public Output<List<HostPortRangeArgs>> getHostPorts() {
        return this.hostPorts == null ? Output.empty() : this.hostPorts;
    }

    /**
     * privileged determines if a pod can request to be run as privileged.
     * 
     */
    @Import(name="privileged")
      private final @Nullable Output<Boolean> privileged;

    public Output<Boolean> getPrivileged() {
        return this.privileged == null ? Output.empty() : this.privileged;
    }

    /**
     * readOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to.
     * 
     */
    @Import(name="readOnlyRootFilesystem")
      private final @Nullable Output<Boolean> readOnlyRootFilesystem;

    public Output<Boolean> getReadOnlyRootFilesystem() {
        return this.readOnlyRootFilesystem == null ? Output.empty() : this.readOnlyRootFilesystem;
    }

    /**
     * requiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added.
     * 
     */
    @Import(name="requiredDropCapabilities")
      private final @Nullable Output<List<String>> requiredDropCapabilities;

    public Output<List<String>> getRequiredDropCapabilities() {
        return this.requiredDropCapabilities == null ? Output.empty() : this.requiredDropCapabilities;
    }

    /**
     * RunAsGroup is the strategy that will dictate the allowable RunAsGroup values that may be set. If this field is omitted, the pod's RunAsGroup can take any value. This field requires the RunAsGroup feature gate to be enabled.
     * 
     */
    @Import(name="runAsGroup")
      private final @Nullable Output<RunAsGroupStrategyOptionsArgs> runAsGroup;

    public Output<RunAsGroupStrategyOptionsArgs> getRunAsGroup() {
        return this.runAsGroup == null ? Output.empty() : this.runAsGroup;
    }

    /**
     * runAsUser is the strategy that will dictate the allowable RunAsUser values that may be set.
     * 
     */
    @Import(name="runAsUser", required=true)
      private final Output<RunAsUserStrategyOptionsArgs> runAsUser;

    public Output<RunAsUserStrategyOptionsArgs> getRunAsUser() {
        return this.runAsUser;
    }

    /**
     * runtimeClass is the strategy that will dictate the allowable RuntimeClasses for a pod. If this field is omitted, the pod's runtimeClassName field is unrestricted. Enforcement of this field depends on the RuntimeClass feature gate being enabled.
     * 
     */
    @Import(name="runtimeClass")
      private final @Nullable Output<RuntimeClassStrategyOptionsArgs> runtimeClass;

    public Output<RuntimeClassStrategyOptionsArgs> getRuntimeClass() {
        return this.runtimeClass == null ? Output.empty() : this.runtimeClass;
    }

    /**
     * seLinux is the strategy that will dictate the allowable labels that may be set.
     * 
     */
    @Import(name="seLinux", required=true)
      private final Output<SELinuxStrategyOptionsArgs> seLinux;

    public Output<SELinuxStrategyOptionsArgs> getSeLinux() {
        return this.seLinux;
    }

    /**
     * supplementalGroups is the strategy that will dictate what supplemental groups are used by the SecurityContext.
     * 
     */
    @Import(name="supplementalGroups", required=true)
      private final Output<SupplementalGroupsStrategyOptionsArgs> supplementalGroups;

    public Output<SupplementalGroupsStrategyOptionsArgs> getSupplementalGroups() {
        return this.supplementalGroups;
    }

    /**
     * volumes is a white list of allowed volume plugins. Empty indicates that no volumes may be used. To allow all volumes you may use '*'.
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<String>> volumes;

    public Output<List<String>> getVolumes() {
        return this.volumes == null ? Output.empty() : this.volumes;
    }

    public PodSecurityPolicySpecArgs(
        @Nullable Output<Boolean> allowPrivilegeEscalation,
        @Nullable Output<List<AllowedCSIDriverArgs>> allowedCSIDrivers,
        @Nullable Output<List<String>> allowedCapabilities,
        @Nullable Output<List<AllowedFlexVolumeArgs>> allowedFlexVolumes,
        @Nullable Output<List<AllowedHostPathArgs>> allowedHostPaths,
        @Nullable Output<List<String>> allowedProcMountTypes,
        @Nullable Output<List<String>> allowedUnsafeSysctls,
        @Nullable Output<List<String>> defaultAddCapabilities,
        @Nullable Output<Boolean> defaultAllowPrivilegeEscalation,
        @Nullable Output<List<String>> forbiddenSysctls,
        Output<FSGroupStrategyOptionsArgs> fsGroup,
        @Nullable Output<Boolean> hostIPC,
        @Nullable Output<Boolean> hostNetwork,
        @Nullable Output<Boolean> hostPID,
        @Nullable Output<List<HostPortRangeArgs>> hostPorts,
        @Nullable Output<Boolean> privileged,
        @Nullable Output<Boolean> readOnlyRootFilesystem,
        @Nullable Output<List<String>> requiredDropCapabilities,
        @Nullable Output<RunAsGroupStrategyOptionsArgs> runAsGroup,
        Output<RunAsUserStrategyOptionsArgs> runAsUser,
        @Nullable Output<RuntimeClassStrategyOptionsArgs> runtimeClass,
        Output<SELinuxStrategyOptionsArgs> seLinux,
        Output<SupplementalGroupsStrategyOptionsArgs> supplementalGroups,
        @Nullable Output<List<String>> volumes) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.allowedCSIDrivers = allowedCSIDrivers;
        this.allowedCapabilities = allowedCapabilities;
        this.allowedFlexVolumes = allowedFlexVolumes;
        this.allowedHostPaths = allowedHostPaths;
        this.allowedProcMountTypes = allowedProcMountTypes;
        this.allowedUnsafeSysctls = allowedUnsafeSysctls;
        this.defaultAddCapabilities = defaultAddCapabilities;
        this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
        this.forbiddenSysctls = forbiddenSysctls;
        this.fsGroup = Objects.requireNonNull(fsGroup, "expected parameter 'fsGroup' to be non-null");
        this.hostIPC = hostIPC;
        this.hostNetwork = hostNetwork;
        this.hostPID = hostPID;
        this.hostPorts = hostPorts;
        this.privileged = privileged;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.requiredDropCapabilities = requiredDropCapabilities;
        this.runAsGroup = runAsGroup;
        this.runAsUser = Objects.requireNonNull(runAsUser, "expected parameter 'runAsUser' to be non-null");
        this.runtimeClass = runtimeClass;
        this.seLinux = Objects.requireNonNull(seLinux, "expected parameter 'seLinux' to be non-null");
        this.supplementalGroups = Objects.requireNonNull(supplementalGroups, "expected parameter 'supplementalGroups' to be non-null");
        this.volumes = volumes;
    }

    private PodSecurityPolicySpecArgs() {
        this.allowPrivilegeEscalation = Output.empty();
        this.allowedCSIDrivers = Output.empty();
        this.allowedCapabilities = Output.empty();
        this.allowedFlexVolumes = Output.empty();
        this.allowedHostPaths = Output.empty();
        this.allowedProcMountTypes = Output.empty();
        this.allowedUnsafeSysctls = Output.empty();
        this.defaultAddCapabilities = Output.empty();
        this.defaultAllowPrivilegeEscalation = Output.empty();
        this.forbiddenSysctls = Output.empty();
        this.fsGroup = Output.empty();
        this.hostIPC = Output.empty();
        this.hostNetwork = Output.empty();
        this.hostPID = Output.empty();
        this.hostPorts = Output.empty();
        this.privileged = Output.empty();
        this.readOnlyRootFilesystem = Output.empty();
        this.requiredDropCapabilities = Output.empty();
        this.runAsGroup = Output.empty();
        this.runAsUser = Output.empty();
        this.runtimeClass = Output.empty();
        this.seLinux = Output.empty();
        this.supplementalGroups = Output.empty();
        this.volumes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityPolicySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowPrivilegeEscalation;
        private @Nullable Output<List<AllowedCSIDriverArgs>> allowedCSIDrivers;
        private @Nullable Output<List<String>> allowedCapabilities;
        private @Nullable Output<List<AllowedFlexVolumeArgs>> allowedFlexVolumes;
        private @Nullable Output<List<AllowedHostPathArgs>> allowedHostPaths;
        private @Nullable Output<List<String>> allowedProcMountTypes;
        private @Nullable Output<List<String>> allowedUnsafeSysctls;
        private @Nullable Output<List<String>> defaultAddCapabilities;
        private @Nullable Output<Boolean> defaultAllowPrivilegeEscalation;
        private @Nullable Output<List<String>> forbiddenSysctls;
        private Output<FSGroupStrategyOptionsArgs> fsGroup;
        private @Nullable Output<Boolean> hostIPC;
        private @Nullable Output<Boolean> hostNetwork;
        private @Nullable Output<Boolean> hostPID;
        private @Nullable Output<List<HostPortRangeArgs>> hostPorts;
        private @Nullable Output<Boolean> privileged;
        private @Nullable Output<Boolean> readOnlyRootFilesystem;
        private @Nullable Output<List<String>> requiredDropCapabilities;
        private @Nullable Output<RunAsGroupStrategyOptionsArgs> runAsGroup;
        private Output<RunAsUserStrategyOptionsArgs> runAsUser;
        private @Nullable Output<RuntimeClassStrategyOptionsArgs> runtimeClass;
        private Output<SELinuxStrategyOptionsArgs> seLinux;
        private Output<SupplementalGroupsStrategyOptionsArgs> supplementalGroups;
        private @Nullable Output<List<String>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSecurityPolicySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPrivilegeEscalation = defaults.allowPrivilegeEscalation;
    	      this.allowedCSIDrivers = defaults.allowedCSIDrivers;
    	      this.allowedCapabilities = defaults.allowedCapabilities;
    	      this.allowedFlexVolumes = defaults.allowedFlexVolumes;
    	      this.allowedHostPaths = defaults.allowedHostPaths;
    	      this.allowedProcMountTypes = defaults.allowedProcMountTypes;
    	      this.allowedUnsafeSysctls = defaults.allowedUnsafeSysctls;
    	      this.defaultAddCapabilities = defaults.defaultAddCapabilities;
    	      this.defaultAllowPrivilegeEscalation = defaults.defaultAllowPrivilegeEscalation;
    	      this.forbiddenSysctls = defaults.forbiddenSysctls;
    	      this.fsGroup = defaults.fsGroup;
    	      this.hostIPC = defaults.hostIPC;
    	      this.hostNetwork = defaults.hostNetwork;
    	      this.hostPID = defaults.hostPID;
    	      this.hostPorts = defaults.hostPorts;
    	      this.privileged = defaults.privileged;
    	      this.readOnlyRootFilesystem = defaults.readOnlyRootFilesystem;
    	      this.requiredDropCapabilities = defaults.requiredDropCapabilities;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsUser = defaults.runAsUser;
    	      this.runtimeClass = defaults.runtimeClass;
    	      this.seLinux = defaults.seLinux;
    	      this.supplementalGroups = defaults.supplementalGroups;
    	      this.volumes = defaults.volumes;
        }

        public Builder allowPrivilegeEscalation(@Nullable Output<Boolean> allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }
        public Builder allowPrivilegeEscalation(@Nullable Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = Output.ofNullable(allowPrivilegeEscalation);
            return this;
        }
        public Builder allowedCSIDrivers(@Nullable Output<List<AllowedCSIDriverArgs>> allowedCSIDrivers) {
            this.allowedCSIDrivers = allowedCSIDrivers;
            return this;
        }
        public Builder allowedCSIDrivers(@Nullable List<AllowedCSIDriverArgs> allowedCSIDrivers) {
            this.allowedCSIDrivers = Output.ofNullable(allowedCSIDrivers);
            return this;
        }
        public Builder allowedCSIDrivers(AllowedCSIDriverArgs... allowedCSIDrivers) {
            return allowedCSIDrivers(List.of(allowedCSIDrivers));
        }
        public Builder allowedCapabilities(@Nullable Output<List<String>> allowedCapabilities) {
            this.allowedCapabilities = allowedCapabilities;
            return this;
        }
        public Builder allowedCapabilities(@Nullable List<String> allowedCapabilities) {
            this.allowedCapabilities = Output.ofNullable(allowedCapabilities);
            return this;
        }
        public Builder allowedCapabilities(String... allowedCapabilities) {
            return allowedCapabilities(List.of(allowedCapabilities));
        }
        public Builder allowedFlexVolumes(@Nullable Output<List<AllowedFlexVolumeArgs>> allowedFlexVolumes) {
            this.allowedFlexVolumes = allowedFlexVolumes;
            return this;
        }
        public Builder allowedFlexVolumes(@Nullable List<AllowedFlexVolumeArgs> allowedFlexVolumes) {
            this.allowedFlexVolumes = Output.ofNullable(allowedFlexVolumes);
            return this;
        }
        public Builder allowedFlexVolumes(AllowedFlexVolumeArgs... allowedFlexVolumes) {
            return allowedFlexVolumes(List.of(allowedFlexVolumes));
        }
        public Builder allowedHostPaths(@Nullable Output<List<AllowedHostPathArgs>> allowedHostPaths) {
            this.allowedHostPaths = allowedHostPaths;
            return this;
        }
        public Builder allowedHostPaths(@Nullable List<AllowedHostPathArgs> allowedHostPaths) {
            this.allowedHostPaths = Output.ofNullable(allowedHostPaths);
            return this;
        }
        public Builder allowedHostPaths(AllowedHostPathArgs... allowedHostPaths) {
            return allowedHostPaths(List.of(allowedHostPaths));
        }
        public Builder allowedProcMountTypes(@Nullable Output<List<String>> allowedProcMountTypes) {
            this.allowedProcMountTypes = allowedProcMountTypes;
            return this;
        }
        public Builder allowedProcMountTypes(@Nullable List<String> allowedProcMountTypes) {
            this.allowedProcMountTypes = Output.ofNullable(allowedProcMountTypes);
            return this;
        }
        public Builder allowedProcMountTypes(String... allowedProcMountTypes) {
            return allowedProcMountTypes(List.of(allowedProcMountTypes));
        }
        public Builder allowedUnsafeSysctls(@Nullable Output<List<String>> allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = allowedUnsafeSysctls;
            return this;
        }
        public Builder allowedUnsafeSysctls(@Nullable List<String> allowedUnsafeSysctls) {
            this.allowedUnsafeSysctls = Output.ofNullable(allowedUnsafeSysctls);
            return this;
        }
        public Builder allowedUnsafeSysctls(String... allowedUnsafeSysctls) {
            return allowedUnsafeSysctls(List.of(allowedUnsafeSysctls));
        }
        public Builder defaultAddCapabilities(@Nullable Output<List<String>> defaultAddCapabilities) {
            this.defaultAddCapabilities = defaultAddCapabilities;
            return this;
        }
        public Builder defaultAddCapabilities(@Nullable List<String> defaultAddCapabilities) {
            this.defaultAddCapabilities = Output.ofNullable(defaultAddCapabilities);
            return this;
        }
        public Builder defaultAddCapabilities(String... defaultAddCapabilities) {
            return defaultAddCapabilities(List.of(defaultAddCapabilities));
        }
        public Builder defaultAllowPrivilegeEscalation(@Nullable Output<Boolean> defaultAllowPrivilegeEscalation) {
            this.defaultAllowPrivilegeEscalation = defaultAllowPrivilegeEscalation;
            return this;
        }
        public Builder defaultAllowPrivilegeEscalation(@Nullable Boolean defaultAllowPrivilegeEscalation) {
            this.defaultAllowPrivilegeEscalation = Output.ofNullable(defaultAllowPrivilegeEscalation);
            return this;
        }
        public Builder forbiddenSysctls(@Nullable Output<List<String>> forbiddenSysctls) {
            this.forbiddenSysctls = forbiddenSysctls;
            return this;
        }
        public Builder forbiddenSysctls(@Nullable List<String> forbiddenSysctls) {
            this.forbiddenSysctls = Output.ofNullable(forbiddenSysctls);
            return this;
        }
        public Builder forbiddenSysctls(String... forbiddenSysctls) {
            return forbiddenSysctls(List.of(forbiddenSysctls));
        }
        public Builder fsGroup(Output<FSGroupStrategyOptionsArgs> fsGroup) {
            this.fsGroup = Objects.requireNonNull(fsGroup);
            return this;
        }
        public Builder fsGroup(FSGroupStrategyOptionsArgs fsGroup) {
            this.fsGroup = Output.of(Objects.requireNonNull(fsGroup));
            return this;
        }
        public Builder hostIPC(@Nullable Output<Boolean> hostIPC) {
            this.hostIPC = hostIPC;
            return this;
        }
        public Builder hostIPC(@Nullable Boolean hostIPC) {
            this.hostIPC = Output.ofNullable(hostIPC);
            return this;
        }
        public Builder hostNetwork(@Nullable Output<Boolean> hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }
        public Builder hostNetwork(@Nullable Boolean hostNetwork) {
            this.hostNetwork = Output.ofNullable(hostNetwork);
            return this;
        }
        public Builder hostPID(@Nullable Output<Boolean> hostPID) {
            this.hostPID = hostPID;
            return this;
        }
        public Builder hostPID(@Nullable Boolean hostPID) {
            this.hostPID = Output.ofNullable(hostPID);
            return this;
        }
        public Builder hostPorts(@Nullable Output<List<HostPortRangeArgs>> hostPorts) {
            this.hostPorts = hostPorts;
            return this;
        }
        public Builder hostPorts(@Nullable List<HostPortRangeArgs> hostPorts) {
            this.hostPorts = Output.ofNullable(hostPorts);
            return this;
        }
        public Builder hostPorts(HostPortRangeArgs... hostPorts) {
            return hostPorts(List.of(hostPorts));
        }
        public Builder privileged(@Nullable Output<Boolean> privileged) {
            this.privileged = privileged;
            return this;
        }
        public Builder privileged(@Nullable Boolean privileged) {
            this.privileged = Output.ofNullable(privileged);
            return this;
        }
        public Builder readOnlyRootFilesystem(@Nullable Output<Boolean> readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }
        public Builder readOnlyRootFilesystem(@Nullable Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = Output.ofNullable(readOnlyRootFilesystem);
            return this;
        }
        public Builder requiredDropCapabilities(@Nullable Output<List<String>> requiredDropCapabilities) {
            this.requiredDropCapabilities = requiredDropCapabilities;
            return this;
        }
        public Builder requiredDropCapabilities(@Nullable List<String> requiredDropCapabilities) {
            this.requiredDropCapabilities = Output.ofNullable(requiredDropCapabilities);
            return this;
        }
        public Builder requiredDropCapabilities(String... requiredDropCapabilities) {
            return requiredDropCapabilities(List.of(requiredDropCapabilities));
        }
        public Builder runAsGroup(@Nullable Output<RunAsGroupStrategyOptionsArgs> runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }
        public Builder runAsGroup(@Nullable RunAsGroupStrategyOptionsArgs runAsGroup) {
            this.runAsGroup = Output.ofNullable(runAsGroup);
            return this;
        }
        public Builder runAsUser(Output<RunAsUserStrategyOptionsArgs> runAsUser) {
            this.runAsUser = Objects.requireNonNull(runAsUser);
            return this;
        }
        public Builder runAsUser(RunAsUserStrategyOptionsArgs runAsUser) {
            this.runAsUser = Output.of(Objects.requireNonNull(runAsUser));
            return this;
        }
        public Builder runtimeClass(@Nullable Output<RuntimeClassStrategyOptionsArgs> runtimeClass) {
            this.runtimeClass = runtimeClass;
            return this;
        }
        public Builder runtimeClass(@Nullable RuntimeClassStrategyOptionsArgs runtimeClass) {
            this.runtimeClass = Output.ofNullable(runtimeClass);
            return this;
        }
        public Builder seLinux(Output<SELinuxStrategyOptionsArgs> seLinux) {
            this.seLinux = Objects.requireNonNull(seLinux);
            return this;
        }
        public Builder seLinux(SELinuxStrategyOptionsArgs seLinux) {
            this.seLinux = Output.of(Objects.requireNonNull(seLinux));
            return this;
        }
        public Builder supplementalGroups(Output<SupplementalGroupsStrategyOptionsArgs> supplementalGroups) {
            this.supplementalGroups = Objects.requireNonNull(supplementalGroups);
            return this;
        }
        public Builder supplementalGroups(SupplementalGroupsStrategyOptionsArgs supplementalGroups) {
            this.supplementalGroups = Output.of(Objects.requireNonNull(supplementalGroups));
            return this;
        }
        public Builder volumes(@Nullable Output<List<String>> volumes) {
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(@Nullable List<String> volumes) {
            this.volumes = Output.ofNullable(volumes);
            return this;
        }
        public Builder volumes(String... volumes) {
            return volumes(List.of(volumes));
        }        public PodSecurityPolicySpecArgs build() {
            return new PodSecurityPolicySpecArgs(allowPrivilegeEscalation, allowedCSIDrivers, allowedCapabilities, allowedFlexVolumes, allowedHostPaths, allowedProcMountTypes, allowedUnsafeSysctls, defaultAddCapabilities, defaultAllowPrivilegeEscalation, forbiddenSysctls, fsGroup, hostIPC, hostNetwork, hostPID, hostPorts, privileged, readOnlyRootFilesystem, requiredDropCapabilities, runAsGroup, runAsUser, runtimeClass, seLinux, supplementalGroups, volumes);
        }
    }
}
