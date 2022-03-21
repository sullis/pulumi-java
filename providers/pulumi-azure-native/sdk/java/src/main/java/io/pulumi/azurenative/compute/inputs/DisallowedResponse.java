// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the disallowed disk types.
 * 
 */
public final class DisallowedResponse extends io.pulumi.resources.InvokeArgs {

    public static final DisallowedResponse Empty = new DisallowedResponse();

    /**
     * A list of disk types.
     * 
     */
    @Import(name="diskTypes")
      private final @Nullable List<String> diskTypes;

    public List<String> getDiskTypes() {
        return this.diskTypes == null ? List.of() : this.diskTypes;
    }

    public DisallowedResponse(@Nullable List<String> diskTypes) {
        this.diskTypes = diskTypes;
    }

    private DisallowedResponse() {
        this.diskTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisallowedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> diskTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DisallowedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskTypes = defaults.diskTypes;
        }

        public Builder diskTypes(@Nullable List<String> diskTypes) {
            this.diskTypes = diskTypes;
            return this;
        }
        public Builder diskTypes(String... diskTypes) {
            return diskTypes(List.of(diskTypes));
        }        public DisallowedResponse build() {
            return new DisallowedResponse(diskTypes);
        }
    }
}
