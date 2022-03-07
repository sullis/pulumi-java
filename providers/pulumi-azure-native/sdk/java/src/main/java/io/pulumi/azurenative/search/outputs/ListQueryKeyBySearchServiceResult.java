// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.outputs;

import io.pulumi.azurenative.search.outputs.QueryKeyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListQueryKeyBySearchServiceResult {
    /**
     * Request URL that can be used to query next page of query keys. Returned when the total number of requested query keys exceed maximum page size.
     * 
     */
    private final String nextLink;
    /**
     * The query keys for the Azure Cognitive Search service.
     * 
     */
    private final List<QueryKeyResponse> value;

    @OutputCustomType.Constructor({"nextLink","value"})
    private ListQueryKeyBySearchServiceResult(
        String nextLink,
        List<QueryKeyResponse> value) {
        this.nextLink = Objects.requireNonNull(nextLink);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Request URL that can be used to query next page of query keys. Returned when the total number of requested query keys exceed maximum page size.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * The query keys for the Azure Cognitive Search service.
     * 
    */
    public List<QueryKeyResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListQueryKeyBySearchServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<QueryKeyResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListQueryKeyBySearchServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder setValue(List<QueryKeyResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListQueryKeyBySearchServiceResult build() {
            return new ListQueryKeyBySearchServiceResult(nextLink, value);
        }
    }
}