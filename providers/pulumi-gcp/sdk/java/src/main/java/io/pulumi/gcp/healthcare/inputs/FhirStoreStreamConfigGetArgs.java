// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreStreamConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreStreamConfigGetArgs Empty = new FhirStoreStreamConfigGetArgs();

    /**
     * The destination BigQuery structure that contains both the dataset location and corresponding schema config.
     * The output is organized in one table per resource type. The server reuses the existing tables (if any) that
     * are named after the resource types, e.g. "Patient", "Observation". When there is no existing table for a given
     * resource type, the server attempts to create one.
     * See the [streaming config reference](https://cloud.google.com/healthcare/docs/reference/rest/v1beta1/projects.locations.datasets.fhirStores#streamconfig) for more details.
     * Structure is documented below.
     * 
     */
    @InputImport(name="bigqueryDestination", required=true)
    private final Input<FhirStoreStreamConfigBigqueryDestinationGetArgs> bigqueryDestination;

    public Input<FhirStoreStreamConfigBigqueryDestinationGetArgs> getBigqueryDestination() {
        return this.bigqueryDestination;
    }

    /**
     * Supply a FHIR resource type (such as "Patient" or "Observation"). See
     * https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats
     * an empty list as an intent to stream all the supported resource types in this FHIR store.
     * 
     */
    @InputImport(name="resourceTypes")
    private final @Nullable Input<List<String>> resourceTypes;

    public Input<List<String>> getResourceTypes() {
        return this.resourceTypes == null ? Input.empty() : this.resourceTypes;
    }

    public FhirStoreStreamConfigGetArgs(
        Input<FhirStoreStreamConfigBigqueryDestinationGetArgs> bigqueryDestination,
        @Nullable Input<List<String>> resourceTypes) {
        this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination, "expected parameter 'bigqueryDestination' to be non-null");
        this.resourceTypes = resourceTypes;
    }

    private FhirStoreStreamConfigGetArgs() {
        this.bigqueryDestination = Input.empty();
        this.resourceTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreStreamConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FhirStoreStreamConfigBigqueryDestinationGetArgs> bigqueryDestination;
        private @Nullable Input<List<String>> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreStreamConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder setBigqueryDestination(Input<FhirStoreStreamConfigBigqueryDestinationGetArgs> bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }

        public Builder setBigqueryDestination(FhirStoreStreamConfigBigqueryDestinationGetArgs bigqueryDestination) {
            this.bigqueryDestination = Input.of(Objects.requireNonNull(bigqueryDestination));
            return this;
        }

        public Builder setResourceTypes(@Nullable Input<List<String>> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder setResourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = Input.ofNullable(resourceTypes);
            return this;
        }

        public FhirStoreStreamConfigGetArgs build() {
            return new FhirStoreStreamConfigGetArgs(bigqueryDestination, resourceTypes);
        }
    }
}
