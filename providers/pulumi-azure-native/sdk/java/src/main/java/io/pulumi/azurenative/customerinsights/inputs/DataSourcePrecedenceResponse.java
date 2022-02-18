// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data source precedence is a way to know the precedence of each data source.
 * 
 */
public final class DataSourcePrecedenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataSourcePrecedenceResponse Empty = new DataSourcePrecedenceResponse();

    /**
     * The data source reference id.
     * 
     */
    @InputImport(name="dataSourceReferenceId", required=true)
    private final String dataSourceReferenceId;

    public String getDataSourceReferenceId() {
        return this.dataSourceReferenceId;
    }

    /**
     * The data source type.
     * 
     */
    @InputImport(name="dataSourceType", required=true)
    private final String dataSourceType;

    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * The data source ID.
     * 
     */
    @InputImport(name="id", required=true)
    private final Integer id;

    public Integer getId() {
        return this.id;
    }

    /**
     * The data source name
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * the precedence value.
     * 
     */
    @InputImport(name="precedence")
    private final @Nullable Integer precedence;

    public Optional<Integer> getPrecedence() {
        return this.precedence == null ? Optional.empty() : Optional.ofNullable(this.precedence);
    }

    /**
     * The data source status.
     * 
     */
    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public DataSourcePrecedenceResponse(
        String dataSourceReferenceId,
        String dataSourceType,
        Integer id,
        String name,
        @Nullable Integer precedence,
        String status) {
        this.dataSourceReferenceId = Objects.requireNonNull(dataSourceReferenceId, "expected parameter 'dataSourceReferenceId' to be non-null");
        this.dataSourceType = Objects.requireNonNull(dataSourceType, "expected parameter 'dataSourceType' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.precedence = precedence;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private DataSourcePrecedenceResponse() {
        this.dataSourceReferenceId = null;
        this.dataSourceType = null;
        this.id = null;
        this.name = null;
        this.precedence = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourcePrecedenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSourceReferenceId;
        private String dataSourceType;
        private Integer id;
        private String name;
        private @Nullable Integer precedence;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourcePrecedenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceReferenceId = defaults.dataSourceReferenceId;
    	      this.dataSourceType = defaults.dataSourceType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.precedence = defaults.precedence;
    	      this.status = defaults.status;
        }

        public Builder setDataSourceReferenceId(String dataSourceReferenceId) {
            this.dataSourceReferenceId = Objects.requireNonNull(dataSourceReferenceId);
            return this;
        }

        public Builder setDataSourceType(String dataSourceType) {
            this.dataSourceType = Objects.requireNonNull(dataSourceType);
            return this;
        }

        public Builder setId(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrecedence(@Nullable Integer precedence) {
            this.precedence = precedence;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public DataSourcePrecedenceResponse build() {
            return new DataSourcePrecedenceResponse(dataSourceReferenceId, dataSourceType, id, name, precedence, status);
        }
    }
}
