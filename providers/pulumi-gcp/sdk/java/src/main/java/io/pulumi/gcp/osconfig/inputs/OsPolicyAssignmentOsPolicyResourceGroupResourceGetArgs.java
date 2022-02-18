// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs();

    /**
     * Exec resource
     * 
     */
    @InputImport(name="exec")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs> exec;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs> getExec() {
        return this.exec == null ? Input.empty() : this.exec;
    }

    /**
     * A remote or local source.
     * 
     */
    @InputImport(name="file")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs> file;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Package resource
     * 
     */
    @InputImport(name="pkg")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs> pkg;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs> getPkg() {
        return this.pkg == null ? Input.empty() : this.pkg;
    }

    /**
     * Package repository resource
     * 
     */
    @InputImport(name="repository")
    private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs> repository;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs> getRepository() {
        return this.repository == null ? Input.empty() : this.repository;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs(
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs> exec,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs> file,
        Input<String> id,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs> pkg,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs> repository) {
        this.exec = exec;
        this.file = file;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.pkg = pkg;
        this.repository = repository;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs() {
        this.exec = Input.empty();
        this.file = Input.empty();
        this.id = Input.empty();
        this.pkg = Input.empty();
        this.repository = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs> exec;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs> file;
        private Input<String> id;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs> pkg;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.file = defaults.file;
    	      this.id = defaults.id;
    	      this.pkg = defaults.pkg;
    	      this.repository = defaults.repository;
        }

        public Builder setExec(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs> exec) {
            this.exec = exec;
            return this;
        }

        public Builder setExec(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecGetArgs exec) {
            this.exec = Input.ofNullable(exec);
            return this;
        }

        public Builder setFile(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs> file) {
            this.file = file;
            return this;
        }

        public Builder setFile(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setPkg(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs> pkg) {
            this.pkg = pkg;
            return this;
        }

        public Builder setPkg(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourcePkgGetArgs pkg) {
            this.pkg = Input.ofNullable(pkg);
            return this;
        }

        public Builder setRepository(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs> repository) {
            this.repository = repository;
            return this;
        }

        public Builder setRepository(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryGetArgs repository) {
            this.repository = Input.ofNullable(repository);
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs(exec, file, id, pkg, repository);
        }
    }
}
