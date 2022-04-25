// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Data Lake Store account information.
 * 
 */
public final class DataLakeStoreAccountInformationResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataLakeStoreAccountInformationResponse Empty = new DataLakeStoreAccountInformationResponse();

    /**
     * The resource identifier.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The optional suffix for the Data Lake Store account.
     * 
     */
    @Import(name="suffix", required=true)
    private String suffix;

    /**
     * @return The optional suffix for the Data Lake Store account.
     * 
     */
    public String suffix() {
        return this.suffix;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    private DataLakeStoreAccountInformationResponse() {}

    private DataLakeStoreAccountInformationResponse(DataLakeStoreAccountInformationResponse $) {
        this.id = $.id;
        this.name = $.name;
        this.suffix = $.suffix;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataLakeStoreAccountInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataLakeStoreAccountInformationResponse $;

        public Builder() {
            $ = new DataLakeStoreAccountInformationResponse();
        }

        public Builder(DataLakeStoreAccountInformationResponse defaults) {
            $ = new DataLakeStoreAccountInformationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The resource identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param suffix The optional suffix for the Data Lake Store account.
         * 
         * @return builder
         * 
         */
        public Builder suffix(String suffix) {
            $.suffix = suffix;
            return this;
        }

        /**
         * @param type The resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public DataLakeStoreAccountInformationResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.suffix = Objects.requireNonNull($.suffix, "expected parameter 'suffix' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
