// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.enums.BuildOptionsLogStreamingOption;
import io.pulumi.googlenative.cloudbuild_v1.enums.BuildOptionsLogging;
import io.pulumi.googlenative.cloudbuild_v1.enums.BuildOptionsMachineType;
import io.pulumi.googlenative.cloudbuild_v1.enums.BuildOptionsRequestedVerifyOption;
import io.pulumi.googlenative.cloudbuild_v1.enums.BuildOptionsSourceProvenanceHashItem;
import io.pulumi.googlenative.cloudbuild_v1.enums.BuildOptionsSubstitutionOption;
import io.pulumi.googlenative.cloudbuild_v1.inputs.PoolOptionArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.VolumeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Optional arguments to enable specific features of builds.
 * 
 */
public final class BuildOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BuildOptionsArgs Empty = new BuildOptionsArgs();

    /**
     * Requested disk size for the VM that runs the build. Note that this is *NOT* "disk free"; some of the space will be used by the operating system and build utilities. Also note that this is the minimum disk size that will be allocated for the build -- the build may run with a larger disk than requested. At present, the maximum disk size is 1000GB; builds that request more than the maximum are rejected with an error.
     * 
     */
    @InputImport(name="diskSizeGb")
      private final @Nullable Input<String> diskSizeGb;

    public Input<String> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * Option to specify whether or not to apply bash style string operations to the substitutions. NOTE: this is always enabled for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @InputImport(name="dynamicSubstitutions")
      private final @Nullable Input<Boolean> dynamicSubstitutions;

    public Input<Boolean> getDynamicSubstitutions() {
        return this.dynamicSubstitutions == null ? Input.empty() : this.dynamicSubstitutions;
    }

    /**
     * A list of global environment variable definitions that will exist for all build steps in this build. If a variable is defined in both globally and in a build step, the variable will use the build step value. The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the value "VALUE".
     * 
     */
    @InputImport(name="env")
      private final @Nullable Input<List<String>> env;

    public Input<List<String>> getEnv() {
        return this.env == null ? Input.empty() : this.env;
    }

    /**
     * Option to define build log streaming behavior to Google Cloud Storage.
     * 
     */
    @InputImport(name="logStreamingOption")
      private final @Nullable Input<BuildOptionsLogStreamingOption> logStreamingOption;

    public Input<BuildOptionsLogStreamingOption> getLogStreamingOption() {
        return this.logStreamingOption == null ? Input.empty() : this.logStreamingOption;
    }

    /**
     * Option to specify the logging mode, which determines if and where build logs are stored.
     * 
     */
    @InputImport(name="logging")
      private final @Nullable Input<BuildOptionsLogging> logging;

    public Input<BuildOptionsLogging> getLogging() {
        return this.logging == null ? Input.empty() : this.logging;
    }

    /**
     * Compute Engine machine type on which to run the build.
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Input<BuildOptionsMachineType> machineType;

    public Input<BuildOptionsMachineType> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * Optional. Specification for execution on a `WorkerPool`. See [running builds in a private pool](https://cloud.google.com/build/docs/private-pools/run-builds-in-private-pool) for more information.
     * 
     */
    @InputImport(name="pool")
      private final @Nullable Input<PoolOptionArgs> pool;

    public Input<PoolOptionArgs> getPool() {
        return this.pool == null ? Input.empty() : this.pool;
    }

    /**
     * Requested verifiability options.
     * 
     */
    @InputImport(name="requestedVerifyOption")
      private final @Nullable Input<BuildOptionsRequestedVerifyOption> requestedVerifyOption;

    public Input<BuildOptionsRequestedVerifyOption> getRequestedVerifyOption() {
        return this.requestedVerifyOption == null ? Input.empty() : this.requestedVerifyOption;
    }

    /**
     * A list of global environment variables, which are encrypted using a Cloud Key Management Service crypto key. These values must be specified in the build's `Secret`. These variables will be available to all build steps in this build.
     * 
     */
    @InputImport(name="secretEnv")
      private final @Nullable Input<List<String>> secretEnv;

    public Input<List<String>> getSecretEnv() {
        return this.secretEnv == null ? Input.empty() : this.secretEnv;
    }

    /**
     * Requested hash for SourceProvenance.
     * 
     */
    @InputImport(name="sourceProvenanceHash")
      private final @Nullable Input<List<BuildOptionsSourceProvenanceHashItem>> sourceProvenanceHash;

    public Input<List<BuildOptionsSourceProvenanceHashItem>> getSourceProvenanceHash() {
        return this.sourceProvenanceHash == null ? Input.empty() : this.sourceProvenanceHash;
    }

    /**
     * Option to specify behavior when there is an error in the substitution checks. NOTE: this is always set to ALLOW_LOOSE for triggered builds and cannot be overridden in the build configuration file.
     * 
     */
    @InputImport(name="substitutionOption")
      private final @Nullable Input<BuildOptionsSubstitutionOption> substitutionOption;

    public Input<BuildOptionsSubstitutionOption> getSubstitutionOption() {
        return this.substitutionOption == null ? Input.empty() : this.substitutionOption;
    }

    /**
     * Global list of volumes to mount for ALL build steps Each volume is created as an empty volume prior to starting the build process. Upon completion of the build, volumes and their contents are discarded. Global volume names and paths cannot conflict with the volumes defined a build step. Using a global volume in a build with only one step is not valid as it is indicative of a build request with an incorrect configuration.
     * 
     */
    @InputImport(name="volumes")
      private final @Nullable Input<List<VolumeArgs>> volumes;

    public Input<List<VolumeArgs>> getVolumes() {
        return this.volumes == null ? Input.empty() : this.volumes;
    }

    /**
     * This field deprecated; please use `pool.name` instead.
     * 
     */
    @InputImport(name="workerPool")
      private final @Nullable Input<String> workerPool;

    public Input<String> getWorkerPool() {
        return this.workerPool == null ? Input.empty() : this.workerPool;
    }

    public BuildOptionsArgs(
        @Nullable Input<String> diskSizeGb,
        @Nullable Input<Boolean> dynamicSubstitutions,
        @Nullable Input<List<String>> env,
        @Nullable Input<BuildOptionsLogStreamingOption> logStreamingOption,
        @Nullable Input<BuildOptionsLogging> logging,
        @Nullable Input<BuildOptionsMachineType> machineType,
        @Nullable Input<PoolOptionArgs> pool,
        @Nullable Input<BuildOptionsRequestedVerifyOption> requestedVerifyOption,
        @Nullable Input<List<String>> secretEnv,
        @Nullable Input<List<BuildOptionsSourceProvenanceHashItem>> sourceProvenanceHash,
        @Nullable Input<BuildOptionsSubstitutionOption> substitutionOption,
        @Nullable Input<List<VolumeArgs>> volumes,
        @Nullable Input<String> workerPool) {
        this.diskSizeGb = diskSizeGb;
        this.dynamicSubstitutions = dynamicSubstitutions;
        this.env = env;
        this.logStreamingOption = logStreamingOption;
        this.logging = logging;
        this.machineType = machineType;
        this.pool = pool;
        this.requestedVerifyOption = requestedVerifyOption;
        this.secretEnv = secretEnv;
        this.sourceProvenanceHash = sourceProvenanceHash;
        this.substitutionOption = substitutionOption;
        this.volumes = volumes;
        this.workerPool = workerPool;
    }

    private BuildOptionsArgs() {
        this.diskSizeGb = Input.empty();
        this.dynamicSubstitutions = Input.empty();
        this.env = Input.empty();
        this.logStreamingOption = Input.empty();
        this.logging = Input.empty();
        this.machineType = Input.empty();
        this.pool = Input.empty();
        this.requestedVerifyOption = Input.empty();
        this.secretEnv = Input.empty();
        this.sourceProvenanceHash = Input.empty();
        this.substitutionOption = Input.empty();
        this.volumes = Input.empty();
        this.workerPool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskSizeGb;
        private @Nullable Input<Boolean> dynamicSubstitutions;
        private @Nullable Input<List<String>> env;
        private @Nullable Input<BuildOptionsLogStreamingOption> logStreamingOption;
        private @Nullable Input<BuildOptionsLogging> logging;
        private @Nullable Input<BuildOptionsMachineType> machineType;
        private @Nullable Input<PoolOptionArgs> pool;
        private @Nullable Input<BuildOptionsRequestedVerifyOption> requestedVerifyOption;
        private @Nullable Input<List<String>> secretEnv;
        private @Nullable Input<List<BuildOptionsSourceProvenanceHashItem>> sourceProvenanceHash;
        private @Nullable Input<BuildOptionsSubstitutionOption> substitutionOption;
        private @Nullable Input<List<VolumeArgs>> volumes;
        private @Nullable Input<String> workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.dynamicSubstitutions = defaults.dynamicSubstitutions;
    	      this.env = defaults.env;
    	      this.logStreamingOption = defaults.logStreamingOption;
    	      this.logging = defaults.logging;
    	      this.machineType = defaults.machineType;
    	      this.pool = defaults.pool;
    	      this.requestedVerifyOption = defaults.requestedVerifyOption;
    	      this.secretEnv = defaults.secretEnv;
    	      this.sourceProvenanceHash = defaults.sourceProvenanceHash;
    	      this.substitutionOption = defaults.substitutionOption;
    	      this.volumes = defaults.volumes;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder setDiskSizeGb(@Nullable Input<String> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable String diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder setDynamicSubstitutions(@Nullable Input<Boolean> dynamicSubstitutions) {
            this.dynamicSubstitutions = dynamicSubstitutions;
            return this;
        }

        public Builder setDynamicSubstitutions(@Nullable Boolean dynamicSubstitutions) {
            this.dynamicSubstitutions = Input.ofNullable(dynamicSubstitutions);
            return this;
        }

        public Builder setEnv(@Nullable Input<List<String>> env) {
            this.env = env;
            return this;
        }

        public Builder setEnv(@Nullable List<String> env) {
            this.env = Input.ofNullable(env);
            return this;
        }

        public Builder setLogStreamingOption(@Nullable Input<BuildOptionsLogStreamingOption> logStreamingOption) {
            this.logStreamingOption = logStreamingOption;
            return this;
        }

        public Builder setLogStreamingOption(@Nullable BuildOptionsLogStreamingOption logStreamingOption) {
            this.logStreamingOption = Input.ofNullable(logStreamingOption);
            return this;
        }

        public Builder setLogging(@Nullable Input<BuildOptionsLogging> logging) {
            this.logging = logging;
            return this;
        }

        public Builder setLogging(@Nullable BuildOptionsLogging logging) {
            this.logging = Input.ofNullable(logging);
            return this;
        }

        public Builder setMachineType(@Nullable Input<BuildOptionsMachineType> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable BuildOptionsMachineType machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setPool(@Nullable Input<PoolOptionArgs> pool) {
            this.pool = pool;
            return this;
        }

        public Builder setPool(@Nullable PoolOptionArgs pool) {
            this.pool = Input.ofNullable(pool);
            return this;
        }

        public Builder setRequestedVerifyOption(@Nullable Input<BuildOptionsRequestedVerifyOption> requestedVerifyOption) {
            this.requestedVerifyOption = requestedVerifyOption;
            return this;
        }

        public Builder setRequestedVerifyOption(@Nullable BuildOptionsRequestedVerifyOption requestedVerifyOption) {
            this.requestedVerifyOption = Input.ofNullable(requestedVerifyOption);
            return this;
        }

        public Builder setSecretEnv(@Nullable Input<List<String>> secretEnv) {
            this.secretEnv = secretEnv;
            return this;
        }

        public Builder setSecretEnv(@Nullable List<String> secretEnv) {
            this.secretEnv = Input.ofNullable(secretEnv);
            return this;
        }

        public Builder setSourceProvenanceHash(@Nullable Input<List<BuildOptionsSourceProvenanceHashItem>> sourceProvenanceHash) {
            this.sourceProvenanceHash = sourceProvenanceHash;
            return this;
        }

        public Builder setSourceProvenanceHash(@Nullable List<BuildOptionsSourceProvenanceHashItem> sourceProvenanceHash) {
            this.sourceProvenanceHash = Input.ofNullable(sourceProvenanceHash);
            return this;
        }

        public Builder setSubstitutionOption(@Nullable Input<BuildOptionsSubstitutionOption> substitutionOption) {
            this.substitutionOption = substitutionOption;
            return this;
        }

        public Builder setSubstitutionOption(@Nullable BuildOptionsSubstitutionOption substitutionOption) {
            this.substitutionOption = Input.ofNullable(substitutionOption);
            return this;
        }

        public Builder setVolumes(@Nullable Input<List<VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder setVolumes(@Nullable List<VolumeArgs> volumes) {
            this.volumes = Input.ofNullable(volumes);
            return this;
        }

        public Builder setWorkerPool(@Nullable Input<String> workerPool) {
            this.workerPool = workerPool;
            return this;
        }

        public Builder setWorkerPool(@Nullable String workerPool) {
            this.workerPool = Input.ofNullable(workerPool);
            return this;
        }
        public BuildOptionsArgs build() {
            return new BuildOptionsArgs(diskSizeGb, dynamicSubstitutions, env, logStreamingOption, logging, machineType, pool, requestedVerifyOption, secretEnv, sourceProvenanceHash, substitutionOption, volumes, workerPool);
        }
    }
}