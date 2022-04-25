// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Databricks Delta Lake export command settings.
 * 
 */
public final class AzureDatabricksDeltaLakeExportCommandResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureDatabricksDeltaLakeExportCommandResponse Empty = new AzureDatabricksDeltaLakeExportCommandResponse();

    /**
     * Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dateFormat")
    private @Nullable Object dateFormat;

    /**
     * @return Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> dateFormat() {
        return Optional.ofNullable(this.dateFormat);
    }

    /**
     * Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="timestampFormat")
    private @Nullable Object timestampFormat;

    /**
     * @return Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }

    /**
     * The export setting type.
     * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The export setting type.
     * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private AzureDatabricksDeltaLakeExportCommandResponse() {}

    private AzureDatabricksDeltaLakeExportCommandResponse(AzureDatabricksDeltaLakeExportCommandResponse $) {
        this.dateFormat = $.dateFormat;
        this.timestampFormat = $.timestampFormat;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDatabricksDeltaLakeExportCommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDatabricksDeltaLakeExportCommandResponse $;

        public Builder() {
            $ = new AzureDatabricksDeltaLakeExportCommandResponse();
        }

        public Builder(AzureDatabricksDeltaLakeExportCommandResponse defaults) {
            $ = new AzureDatabricksDeltaLakeExportCommandResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dateFormat Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder dateFormat(@Nullable Object dateFormat) {
            $.dateFormat = dateFormat;
            return this;
        }

        /**
         * @param timestampFormat Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(@Nullable Object timestampFormat) {
            $.timestampFormat = timestampFormat;
            return this;
        }

        /**
         * @param type The export setting type.
         * Expected value is &#39;AzureDatabricksDeltaLakeExportCommand&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AzureDatabricksDeltaLakeExportCommandResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
