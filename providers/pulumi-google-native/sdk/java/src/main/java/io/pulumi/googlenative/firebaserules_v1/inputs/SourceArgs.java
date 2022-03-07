// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.firebaserules_v1.inputs.FileArgs;
import java.util.List;
import java.util.Objects;


/**
 * `Source` is one or more `File` messages comprising a logical set of rules.
 * 
 */
public final class SourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * `File` set constituting the `Source` bundle.
     * 
     */
    @InputImport(name="files", required=true)
      private final Input<List<FileArgs>> files;

    public Input<List<FileArgs>> getFiles() {
        return this.files;
    }

    public SourceArgs(Input<List<FileArgs>> files) {
        this.files = Objects.requireNonNull(files, "expected parameter 'files' to be non-null");
    }

    private SourceArgs() {
        this.files = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<FileArgs>> files;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
        }

        public Builder setFiles(Input<List<FileArgs>> files) {
            this.files = Objects.requireNonNull(files);
            return this;
        }

        public Builder setFiles(List<FileArgs> files) {
            this.files = Input.of(Objects.requireNonNull(files));
            return this;
        }
        public SourceArgs build() {
            return new SourceArgs(files);
        }
    }
}