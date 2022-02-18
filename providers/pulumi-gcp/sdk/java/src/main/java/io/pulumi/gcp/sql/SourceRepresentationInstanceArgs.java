// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SourceRepresentationInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceRepresentationInstanceArgs Empty = new SourceRepresentationInstanceArgs();

    /**
     * The MySQL version running on your source database server.
     * Possible values are `MYSQL_5_5`, `MYSQL_5_6`, `MYSQL_5_7`, and `MYSQL_8_0`.
     * 
     */
    @InputImport(name="databaseVersion", required=true)
    private final Input<String> databaseVersion;

    public Input<String> getDatabaseVersion() {
        return this.databaseVersion;
    }

    /**
     * The externally accessible IPv4 address for the source database server.
     * 
     */
    @InputImport(name="host", required=true)
    private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    /**
     * The name of the source representation instance. Use any valid Cloud SQL instance name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The externally accessible port for the source database server.
     * Defaults to 3306.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The Region in which the created instance should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public SourceRepresentationInstanceArgs(
        Input<String> databaseVersion,
        Input<String> host,
        @Nullable Input<String> name,
        @Nullable Input<Integer> port,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.databaseVersion = Objects.requireNonNull(databaseVersion, "expected parameter 'databaseVersion' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.name = name;
        this.port = port;
        this.project = project;
        this.region = region;
    }

    private SourceRepresentationInstanceArgs() {
        this.databaseVersion = Input.empty();
        this.host = Input.empty();
        this.name = Input.empty();
        this.port = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceRepresentationInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> databaseVersion;
        private Input<String> host;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceRepresentationInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.host = defaults.host;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setDatabaseVersion(Input<String> databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }

        public Builder setDatabaseVersion(String databaseVersion) {
            this.databaseVersion = Input.of(Objects.requireNonNull(databaseVersion));
            return this;
        }

        public Builder setHost(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public SourceRepresentationInstanceArgs build() {
            return new SourceRepresentationInstanceArgs(databaseVersion, host, name, port, project, region);
        }
    }
}
