// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes the named partition scheme of the service.
 * 
 */
public final class NamedPartitionSchemeDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final NamedPartitionSchemeDescriptionResponse Empty = new NamedPartitionSchemeDescriptionResponse();

    /**
     * The number of partitions.
     * 
     */
    @InputImport(name="count", required=true)
    private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * Array of size specified by the ‘count’ parameter, for the names of the partitions.
     * 
     */
    @InputImport(name="names", required=true)
    private final List<String> names;

    public List<String> getNames() {
        return this.names;
    }

    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'Named'.
     * 
     */
    @InputImport(name="partitionScheme", required=true)
    private final String partitionScheme;

    public String getPartitionScheme() {
        return this.partitionScheme;
    }

    public NamedPartitionSchemeDescriptionResponse(
        Integer count,
        List<String> names,
        String partitionScheme) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.names = Objects.requireNonNull(names, "expected parameter 'names' to be non-null");
        this.partitionScheme = Objects.requireNonNull(partitionScheme, "expected parameter 'partitionScheme' to be non-null");
    }

    private NamedPartitionSchemeDescriptionResponse() {
        this.count = null;
        this.names = List.of();
        this.partitionScheme = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedPartitionSchemeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private List<String> names;
        private String partitionScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(NamedPartitionSchemeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.names = defaults.names;
    	      this.partitionScheme = defaults.partitionScheme;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setNames(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }

        public Builder setPartitionScheme(String partitionScheme) {
            this.partitionScheme = Objects.requireNonNull(partitionScheme);
            return this;
        }

        public NamedPartitionSchemeDescriptionResponse build() {
            return new NamedPartitionSchemeDescriptionResponse(count, names, partitionScheme);
        }
    }
}
