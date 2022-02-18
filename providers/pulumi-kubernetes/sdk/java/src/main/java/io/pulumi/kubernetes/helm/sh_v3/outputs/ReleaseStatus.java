// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.helm.sh_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReleaseStatus {
    /**
     * The version number of the application being deployed.
     * 
     */
    private final @Nullable String appVersion;
    /**
     * The name of the chart.
     * 
     */
    private final @Nullable String chart;
    /**
     * Name is the name of the release.
     * 
     */
    private final @Nullable String name;
    /**
     * Namespace is the kubernetes namespace of the release.
     * 
     */
    private final @Nullable String namespace;
    /**
     * Version is an int32 which represents the version of the release.
     * 
     */
    private final @Nullable Integer revision;
    /**
     * Status of the release.
     * 
     */
    private final String status;
    /**
     * A SemVer 2 conformant version string of the chart.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"appVersion","chart","name","namespace","revision","status","version"})
    private ReleaseStatus(
        @Nullable String appVersion,
        @Nullable String chart,
        @Nullable String name,
        @Nullable String namespace,
        @Nullable Integer revision,
        String status,
        @Nullable String version) {
        this.appVersion = appVersion;
        this.chart = chart;
        this.name = name;
        this.namespace = namespace;
        this.revision = revision;
        this.status = Objects.requireNonNull(status);
        this.version = version;
    }

    /**
     * The version number of the application being deployed.
     * 
     */
    public Optional<String> getAppVersion() {
        return Optional.ofNullable(this.appVersion);
    }
    /**
     * The name of the chart.
     * 
     */
    public Optional<String> getChart() {
        return Optional.ofNullable(this.chart);
    }
    /**
     * Name is the name of the release.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Namespace is the kubernetes namespace of the release.
     * 
     */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * Version is an int32 which represents the version of the release.
     * 
     */
    public Optional<Integer> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * Status of the release.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * A SemVer 2 conformant version string of the chart.
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appVersion;
        private @Nullable String chart;
        private @Nullable String name;
        private @Nullable String namespace;
        private @Nullable Integer revision;
        private String status;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appVersion = defaults.appVersion;
    	      this.chart = defaults.chart;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.revision = defaults.revision;
    	      this.status = defaults.status;
    	      this.version = defaults.version;
        }

        public Builder setAppVersion(@Nullable String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        public Builder setChart(@Nullable String chart) {
            this.chart = chart;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setRevision(@Nullable Integer revision) {
            this.revision = revision;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ReleaseStatus build() {
            return new ReleaseStatus(appVersion, chart, name, namespace, revision, status, version);
        }
    }
}
