// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetPoolArgs Empty = new TargetPoolArgs();

    /**
     * URL to the backup target pool. Must also set
     * failover\_ratio.
     * 
     */
    @Import(name="backupPool")
      private final @Nullable Output<String> backupPool;

    public Output<String> getBackupPool() {
        return this.backupPool == null ? Output.empty() : this.backupPool;
    }

    /**
     * Textual description field.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Ratio (0 to 1) of failed nodes before using the
     * backup pool (which must also be set).
     * 
     */
    @Import(name="failoverRatio")
      private final @Nullable Output<Double> failoverRatio;

    public Output<Double> getFailoverRatio() {
        return this.failoverRatio == null ? Output.empty() : this.failoverRatio;
    }

    /**
     * List of zero or one health check name or self_link. Only
     * legacy `gcp.compute.HttpHealthCheck` is supported.
     * 
     */
    @Import(name="healthChecks")
      private final @Nullable Output<String> healthChecks;

    public Output<String> getHealthChecks() {
        return this.healthChecks == null ? Output.empty() : this.healthChecks;
    }

    /**
     * List of instances in the pool. They can be given as
     * URLs, or in the form of "zone/name". Note that the instances need not exist
     * at the time of target pool creation, so there is no need to use the
     * interpolation to create a dependency on the instances from the
     * target pool.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<String>> instances;

    public Output<List<String>> getInstances() {
        return this.instances == null ? Output.empty() : this.instances;
    }

    /**
     * A unique name for the resource, required by GCE. Changing
     * this forces a new resource to be created.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Where the target pool resides. Defaults to project
     * region.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * How to distribute load. Options are "NONE" (no
     * affinity). "CLIENT\_IP" (hash of the source/dest addresses / ports), and
     * "CLIENT\_IP\_PROTO" also includes the protocol (default "NONE").
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<String> sessionAffinity;

    public Output<String> getSessionAffinity() {
        return this.sessionAffinity == null ? Output.empty() : this.sessionAffinity;
    }

    public TargetPoolArgs(
        @Nullable Output<String> backupPool,
        @Nullable Output<String> description,
        @Nullable Output<Double> failoverRatio,
        @Nullable Output<String> healthChecks,
        @Nullable Output<List<String>> instances,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> sessionAffinity) {
        this.backupPool = backupPool;
        this.description = description;
        this.failoverRatio = failoverRatio;
        this.healthChecks = healthChecks;
        this.instances = instances;
        this.name = name;
        this.project = project;
        this.region = region;
        this.sessionAffinity = sessionAffinity;
    }

    private TargetPoolArgs() {
        this.backupPool = Output.empty();
        this.description = Output.empty();
        this.failoverRatio = Output.empty();
        this.healthChecks = Output.empty();
        this.instances = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.sessionAffinity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backupPool;
        private @Nullable Output<String> description;
        private @Nullable Output<Double> failoverRatio;
        private @Nullable Output<String> healthChecks;
        private @Nullable Output<List<String>> instances;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> sessionAffinity;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPool = defaults.backupPool;
    	      this.description = defaults.description;
    	      this.failoverRatio = defaults.failoverRatio;
    	      this.healthChecks = defaults.healthChecks;
    	      this.instances = defaults.instances;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.sessionAffinity = defaults.sessionAffinity;
        }

        public Builder backupPool(@Nullable Output<String> backupPool) {
            this.backupPool = backupPool;
            return this;
        }
        public Builder backupPool(@Nullable String backupPool) {
            this.backupPool = Output.ofNullable(backupPool);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder failoverRatio(@Nullable Output<Double> failoverRatio) {
            this.failoverRatio = failoverRatio;
            return this;
        }
        public Builder failoverRatio(@Nullable Double failoverRatio) {
            this.failoverRatio = Output.ofNullable(failoverRatio);
            return this;
        }
        public Builder healthChecks(@Nullable Output<String> healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }
        public Builder healthChecks(@Nullable String healthChecks) {
            this.healthChecks = Output.ofNullable(healthChecks);
            return this;
        }
        public Builder instances(@Nullable Output<List<String>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<String> instances) {
            this.instances = Output.ofNullable(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder sessionAffinity(@Nullable Output<String> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable String sessionAffinity) {
            this.sessionAffinity = Output.ofNullable(sessionAffinity);
            return this;
        }        public TargetPoolArgs build() {
            return new TargetPoolArgs(backupPool, description, failoverRatio, healthChecks, instances, name, project, region, sessionAffinity);
        }
    }
}
