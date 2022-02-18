// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServerDnsAliasResult {
    /**
     * The fully qualified DNS record for alias
     * 
     */
    private final String azureDnsRecord;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"azureDnsRecord","id","name","type"})
    private GetServerDnsAliasResult(
        String azureDnsRecord,
        String id,
        String name,
        String type) {
        this.azureDnsRecord = Objects.requireNonNull(azureDnsRecord);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The fully qualified DNS record for alias
     * 
     */
    public String getAzureDnsRecord() {
        return this.azureDnsRecord;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerDnsAliasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureDnsRecord;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerDnsAliasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDnsRecord = defaults.azureDnsRecord;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setAzureDnsRecord(String azureDnsRecord) {
            this.azureDnsRecord = Objects.requireNonNull(azureDnsRecord);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetServerDnsAliasResult build() {
            return new GetServerDnsAliasResult(azureDnsRecord, id, name, type);
        }
    }
}
