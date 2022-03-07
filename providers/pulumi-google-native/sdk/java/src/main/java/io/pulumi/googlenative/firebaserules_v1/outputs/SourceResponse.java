// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.firebaserules_v1.outputs.FileResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SourceResponse {
    /**
     * `File` set constituting the `Source` bundle.
     * 
     */
    private final List<FileResponse> files;

    @OutputCustomType.Constructor({"files"})
    private SourceResponse(List<FileResponse> files) {
        this.files = Objects.requireNonNull(files);
    }

    /**
     * `File` set constituting the `Source` bundle.
     * 
    */
    public List<FileResponse> getFiles() {
        return this.files;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FileResponse> files;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
        }

        public Builder setFiles(List<FileResponse> files) {
            this.files = Objects.requireNonNull(files);
            return this;
        }
        public SourceResponse build() {
            return new SourceResponse(files);
        }
    }
}