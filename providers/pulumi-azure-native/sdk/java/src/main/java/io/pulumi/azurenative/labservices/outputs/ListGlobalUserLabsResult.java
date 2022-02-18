// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.LabDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListGlobalUserLabsResult {
    /**
     * List of all the labs
     * 
     */
    private final @Nullable List<LabDetailsResponse> labs;

    @OutputCustomType.Constructor({"labs"})
    private ListGlobalUserLabsResult(@Nullable List<LabDetailsResponse> labs) {
        this.labs = labs;
    }

    /**
     * List of all the labs
     * 
     */
    public List<LabDetailsResponse> getLabs() {
        return this.labs == null ? List.of() : this.labs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListGlobalUserLabsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LabDetailsResponse> labs;

        public Builder() {
    	      // Empty
        }

        public Builder(ListGlobalUserLabsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labs = defaults.labs;
        }

        public Builder setLabs(@Nullable List<LabDetailsResponse> labs) {
            this.labs = labs;
            return this;
        }

        public ListGlobalUserLabsResult build() {
            return new ListGlobalUserLabsResult(labs);
        }
    }
}
