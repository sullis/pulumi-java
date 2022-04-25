// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FhirStoreStreamConfigBigqueryDestinationSchemaConfig {
    /**
     * @return The depth for all recursive structures in the output analytics schema. For example, concept in the CodeSystem
     * resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called
     * concept.concept but not concept.concept.concept. If not specified or set to 0, the server will use the default
     * value 2. The maximum depth allowed is 5.
     * 
     */
    private final Integer recursiveStructureDepth;
    /**
     * @return Specifies the output schema type. Only ANALYTICS is supported at this time.
     * * ANALYTICS: Analytics schema defined by the FHIR community.
     *   See https://github.com/FHIR/sql-on-fhir/blob/master/sql-on-fhir.md.
     *   Default value is `ANALYTICS`.
     *   Possible values are `ANALYTICS`.
     * 
     */
    private final @Nullable String schemaType;

    @CustomType.Constructor
    private FhirStoreStreamConfigBigqueryDestinationSchemaConfig(
        @CustomType.Parameter("recursiveStructureDepth") Integer recursiveStructureDepth,
        @CustomType.Parameter("schemaType") @Nullable String schemaType) {
        this.recursiveStructureDepth = recursiveStructureDepth;
        this.schemaType = schemaType;
    }

    /**
     * @return The depth for all recursive structures in the output analytics schema. For example, concept in the CodeSystem
     * resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called
     * concept.concept but not concept.concept.concept. If not specified or set to 0, the server will use the default
     * value 2. The maximum depth allowed is 5.
     * 
     */
    public Integer recursiveStructureDepth() {
        return this.recursiveStructureDepth;
    }
    /**
     * @return Specifies the output schema type. Only ANALYTICS is supported at this time.
     * * ANALYTICS: Analytics schema defined by the FHIR community.
     *   See https://github.com/FHIR/sql-on-fhir/blob/master/sql-on-fhir.md.
     *   Default value is `ANALYTICS`.
     *   Possible values are `ANALYTICS`.
     * 
     */
    public Optional<String> schemaType() {
        return Optional.ofNullable(this.schemaType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreStreamConfigBigqueryDestinationSchemaConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer recursiveStructureDepth;
        private @Nullable String schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreStreamConfigBigqueryDestinationSchemaConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recursiveStructureDepth = defaults.recursiveStructureDepth;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder recursiveStructureDepth(Integer recursiveStructureDepth) {
            this.recursiveStructureDepth = Objects.requireNonNull(recursiveStructureDepth);
            return this;
        }
        public Builder schemaType(@Nullable String schemaType) {
            this.schemaType = schemaType;
            return this;
        }        public FhirStoreStreamConfigBigqueryDestinationSchemaConfig build() {
            return new FhirStoreStreamConfigBigqueryDestinationSchemaConfig(recursiveStructureDepth, schemaType);
        }
    }
}
