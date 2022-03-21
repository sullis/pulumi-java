// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGroupLaunchTemplate extends io.pulumi.resources.InvokeArgs {

    public static final GetGroupLaunchTemplate Empty = new GetGroupLaunchTemplate();

    /**
     * Name of the Auto Scaling Group.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Specify the exact name of the desired autoscaling group.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public GetGroupLaunchTemplate(
        String id,
        String name,
        String version) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GetGroupLaunchTemplate() {
        this.id = null;
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupLaunchTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupLaunchTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetGroupLaunchTemplate build() {
            return new GetGroupLaunchTemplate(id, name, version);
        }
    }
}
