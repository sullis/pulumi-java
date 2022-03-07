// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SslCertArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslCertArgs Empty = new SslCertArgs();

    /**
     * User supplied name. Must be a distinct name from the other certificates for this instance.
     * 
     */
    @InputImport(name="commonName")
      private final @Nullable Input<String> commonName;

    public Input<String> getCommonName() {
        return this.commonName == null ? Input.empty() : this.commonName;
    }

    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public SslCertArgs(
        @Nullable Input<String> commonName,
        Input<String> instance,
        @Nullable Input<String> project) {
        this.commonName = commonName;
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.project = project;
    }

    private SslCertArgs() {
        this.commonName = Input.empty();
        this.instance = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> commonName;
        private Input<String> instance;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.instance = defaults.instance;
    	      this.project = defaults.project;
        }

        public Builder setCommonName(@Nullable Input<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder setCommonName(@Nullable String commonName) {
            this.commonName = Input.ofNullable(commonName);
            return this;
        }

        public Builder setInstance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder setInstance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
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
        public SslCertArgs build() {
            return new SslCertArgs(commonName, instance, project);
        }
    }
}