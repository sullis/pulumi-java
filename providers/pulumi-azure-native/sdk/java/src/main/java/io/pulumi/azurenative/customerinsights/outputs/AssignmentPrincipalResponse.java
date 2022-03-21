// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AssignmentPrincipalResponse {
    /**
     * The principal id being assigned to.
     * 
     */
    private final String principalId;
    /**
     * Other metadata for the principal.
     * 
     */
    private final @Nullable Map<String,String> principalMetadata;
    /**
     * The Type of the principal ID.
     * 
     */
    private final String principalType;

    @CustomType.Constructor
    private AssignmentPrincipalResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("principalMetadata") @Nullable Map<String,String> principalMetadata,
        @CustomType.Parameter("principalType") String principalType) {
        this.principalId = principalId;
        this.principalMetadata = principalMetadata;
        this.principalType = principalType;
    }

    /**
     * The principal id being assigned to.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Other metadata for the principal.
     * 
    */
    public Map<String,String> getPrincipalMetadata() {
        return this.principalMetadata == null ? Map.of() : this.principalMetadata;
    }
    /**
     * The Type of the principal ID.
     * 
    */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentPrincipalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private @Nullable Map<String,String> principalMetadata;
        private String principalType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentPrincipalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.principalMetadata = defaults.principalMetadata;
    	      this.principalType = defaults.principalType;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalMetadata(@Nullable Map<String,String> principalMetadata) {
            this.principalMetadata = principalMetadata;
            return this;
        }
        public Builder principalType(String principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }        public AssignmentPrincipalResponse build() {
            return new AssignmentPrincipalResponse(principalId, principalMetadata, principalType);
        }
    }
}
