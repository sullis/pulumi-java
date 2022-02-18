// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describe a container image
 * 
 */
public final class ContainerImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerImageArgs Empty = new ContainerImageArgs();

    /**
     * Names by which this image is known. e.g. ["k8s.gcr.io/hyperkube:v1.0.7", "dockerhub.io/google_containers/hyperkube:v1.0.7"]
     * 
     */
    @InputImport(name="names", required=true)
    private final Input<List<String>> names;

    public Input<List<String>> getNames() {
        return this.names;
    }

    /**
     * The size of the image in bytes.
     * 
     */
    @InputImport(name="sizeBytes")
    private final @Nullable Input<Integer> sizeBytes;

    public Input<Integer> getSizeBytes() {
        return this.sizeBytes == null ? Input.empty() : this.sizeBytes;
    }

    public ContainerImageArgs(
        Input<List<String>> names,
        @Nullable Input<Integer> sizeBytes) {
        this.names = Objects.requireNonNull(names, "expected parameter 'names' to be non-null");
        this.sizeBytes = sizeBytes;
    }

    private ContainerImageArgs() {
        this.names = Input.empty();
        this.sizeBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> names;
        private @Nullable Input<Integer> sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.names = defaults.names;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder setNames(Input<List<String>> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Input.of(Objects.requireNonNull(names));
            return this;
        }

        public Builder setSizeBytes(@Nullable Input<Integer> sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }

        public Builder setSizeBytes(@Nullable Integer sizeBytes) {
            this.sizeBytes = Input.ofNullable(sizeBytes);
            return this;
        }

        public ContainerImageArgs build() {
            return new ContainerImageArgs(names, sizeBytes);
        }
    }
}
