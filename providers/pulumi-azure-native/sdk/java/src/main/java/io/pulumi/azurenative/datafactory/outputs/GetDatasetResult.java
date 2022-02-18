// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AmazonMWSObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRdsForOracleTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRdsForSqlServerTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonRedshiftTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3DatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AvroDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataExplorerTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDatabricksDeltaLakeDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMariaDBTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureMySqlTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzurePostgreSqlTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSearchIndexDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlDWTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlMITableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureSqlTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.BinaryDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.CassandraTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.CommonDataServiceForAppsEntityDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ConcurObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbMongoDbApiCollectionDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.CosmosDbSqlApiCollectionDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.CouchbaseTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.CustomDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.Db2TableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.DelimitedTextDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.DocumentDbCollectionDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.DrillTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsAXResourceDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsCrmEntityDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.DynamicsEntityDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.EloquaObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ExcelDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.FileShareDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleAdWordsObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleBigQueryObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.GreenplumTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.HBaseObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.HiveObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.HttpDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.HubspotObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ImpalaObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.InformixTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.JiraObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.JsonDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.MagentoObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.MariaDBTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.MarketoObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.MicrosoftAccessTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbAtlasCollectionDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbCollectionDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.MongoDbV2CollectionDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.MySqlTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.NetezzaTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ODataResourceDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.OdbcTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.Office365DatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleServiceCloudObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.OrcDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ParquetDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.PaypalObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.PhoenixObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.PostgreSqlTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.PrestoObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.QuickBooksObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.RelationalTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ResponsysObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.RestResourceDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceMarketingCloudObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SalesforceServiceCloudObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SapBwCubeDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SapCloudForCustomerResourceDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SapEccResourceDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SapHanaTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SapOpenHubTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SapTableResourceDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ServiceNowObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SharePointOnlineListResourceDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ShopifyObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SnowflakeDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SparkObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SqlServerTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SquareObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.SybaseTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.TeradataTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.VerticaTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.WebTableDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.XeroObjectDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.XmlDatasetResponse;
import io.pulumi.azurenative.datafactory.outputs.ZohoObjectDatasetResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDatasetResult {
    /**
     * Etag identifies change in the resource.
     * 
     */
    private final String etag;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * Dataset properties.
     * 
     */
    private final Object properties;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","properties","type"})
    private GetDatasetResult(
        String etag,
        String id,
        String name,
        Object properties,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Etag identifies change in the resource.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Dataset properties.
     * 
     */
    public Object getProperties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String name;
        private Object properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
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

        public Builder setProperties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDatasetResult build() {
            return new GetDatasetResult(etag, id, name, properties, type);
        }
    }
}
