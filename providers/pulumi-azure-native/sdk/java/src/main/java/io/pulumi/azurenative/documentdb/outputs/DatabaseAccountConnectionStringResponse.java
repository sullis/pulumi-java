// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatabaseAccountConnectionStringResponse {
    /**
     * Value of the connection string
     * 
     */
    private final String connectionString;
    /**
     * Description of the connection string
     * 
     */
    private final String description;

    @OutputCustomType.Constructor({"connectionString","description"})
    private DatabaseAccountConnectionStringResponse(
        String connectionString,
        String description) {
        this.connectionString = Objects.requireNonNull(connectionString);
        this.description = Objects.requireNonNull(description);
    }

    /**
     * Value of the connection string
     * 
     */
    public String getConnectionString() {
        return this.connectionString;
    }
    /**
     * Description of the connection string
     * 
     */
    public String getDescription() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseAccountConnectionStringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionString;
        private String description;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseAccountConnectionStringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
        }

        public Builder setConnectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public DatabaseAccountConnectionStringResponse build() {
            return new DatabaseAccountConnectionStringResponse(connectionString, description);
        }
    }
}
