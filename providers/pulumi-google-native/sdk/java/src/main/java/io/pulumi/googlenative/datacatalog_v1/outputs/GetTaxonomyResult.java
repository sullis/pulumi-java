// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1SystemTimestampsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTaxonomyResult {
    /**
     * Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    private final List<String> activatedPolicyTypes;
    /**
     * Optional. Description of this taxonomy. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns, and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
     */
    private final String description;
    /**
     * User-defined name of this taxonomy. The name can't start or end with spaces, must contain only Unicode letters, numbers, underscores, dashes, and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    private final String displayName;
    /**
     * Resource name of this taxonomy in URL format. Note: Policy tag manager generates unique taxonomy IDs.
     * 
     */
    private final String name;
    /**
     * Number of policy tags in this taxonomy.
     * 
     */
    private final Integer policyTagCount;
    /**
     * Creation and modification timestamps of this taxonomy.
     * 
     */
    private final GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps;

    @CustomType.Constructor
    private GetTaxonomyResult(
        @CustomType.Parameter("activatedPolicyTypes") List<String> activatedPolicyTypes,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policyTagCount") Integer policyTagCount,
        @CustomType.Parameter("taxonomyTimestamps") GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps) {
        this.activatedPolicyTypes = activatedPolicyTypes;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.policyTagCount = policyTagCount;
        this.taxonomyTimestamps = taxonomyTimestamps;
    }

    /**
     * Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
    */
    public List<String> getActivatedPolicyTypes() {
        return this.activatedPolicyTypes;
    }
    /**
     * Optional. Description of this taxonomy. If not set, defaults to empty. The description must contain only Unicode characters, tabs, newlines, carriage returns, and page breaks, and be at most 2000 bytes long when encoded in UTF-8.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * User-defined name of this taxonomy. The name can't start or end with spaces, must contain only Unicode letters, numbers, underscores, dashes, and spaces, and be at most 200 bytes long when encoded in UTF-8.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource name of this taxonomy in URL format. Note: Policy tag manager generates unique taxonomy IDs.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Number of policy tags in this taxonomy.
     * 
    */
    public Integer getPolicyTagCount() {
        return this.policyTagCount;
    }
    /**
     * Creation and modification timestamps of this taxonomy.
     * 
    */
    public GoogleCloudDatacatalogV1SystemTimestampsResponse getTaxonomyTimestamps() {
        return this.taxonomyTimestamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaxonomyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> activatedPolicyTypes;
        private String description;
        private String displayName;
        private String name;
        private Integer policyTagCount;
        private GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaxonomyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedPolicyTypes = defaults.activatedPolicyTypes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.policyTagCount = defaults.policyTagCount;
    	      this.taxonomyTimestamps = defaults.taxonomyTimestamps;
        }

        public Builder activatedPolicyTypes(List<String> activatedPolicyTypes) {
            this.activatedPolicyTypes = Objects.requireNonNull(activatedPolicyTypes);
            return this;
        }
        public Builder activatedPolicyTypes(String... activatedPolicyTypes) {
            return activatedPolicyTypes(List.of(activatedPolicyTypes));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policyTagCount(Integer policyTagCount) {
            this.policyTagCount = Objects.requireNonNull(policyTagCount);
            return this;
        }
        public Builder taxonomyTimestamps(GoogleCloudDatacatalogV1SystemTimestampsResponse taxonomyTimestamps) {
            this.taxonomyTimestamps = Objects.requireNonNull(taxonomyTimestamps);
            return this;
        }        public GetTaxonomyResult build() {
            return new GetTaxonomyResult(activatedPolicyTypes, description, displayName, name, policyTagCount, taxonomyTimestamps);
        }
    }
}
