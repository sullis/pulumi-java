// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.quicksight.DataSourceArgs;
import io.pulumi.awsnative.quicksight.enums.DataSourceResourceStatus;
import io.pulumi.awsnative.quicksight.enums.DataSourceType;
import io.pulumi.awsnative.quicksight.outputs.DataSourceCredentials;
import io.pulumi.awsnative.quicksight.outputs.DataSourceErrorInfo;
import io.pulumi.awsnative.quicksight.outputs.DataSourceParameters;
import io.pulumi.awsnative.quicksight.outputs.DataSourceResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.DataSourceSslProperties;
import io.pulumi.awsnative.quicksight.outputs.DataSourceTag;
import io.pulumi.awsnative.quicksight.outputs.DataSourceVpcConnectionProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of the AWS::QuickSight::DataSource Resource Type.
 * 
 */
@ResourceType(type="aws-native:quicksight:DataSource")
public class DataSource extends io.pulumi.resources.CustomResource {
    /**
     * <p>A set of alternate data source parameters that you want to share for the credentials
     *             stored with this data source. The credentials are applied in tandem with the data source
     *             parameters when you copy a data source by using a create or update request. The API
     *             operation compares the <code>DataSourceParameters</code> structure that's in the request
     *             with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *             structures are an exact match, the request is allowed to use the credentials from this
     *             existing data source. If the <code>AlternateDataSourceParameters</code> list is null,
     *             the <code>Credentials</code> originally used with this <code>DataSourceParameters</code>
     *             are automatically allowed.</p>
     * 
     */
    @OutputExport(name="alternateDataSourceParameters", type=List.class, parameters={DataSourceParameters.class})
    private Output</* @Nullable */ List<DataSourceParameters>> alternateDataSourceParameters;

    /**
     * @return <p>A set of alternate data source parameters that you want to share for the credentials
     *             stored with this data source. The credentials are applied in tandem with the data source
     *             parameters when you copy a data source by using a create or update request. The API
     *             operation compares the <code>DataSourceParameters</code> structure that's in the request
     *             with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *             structures are an exact match, the request is allowed to use the credentials from this
     *             existing data source. If the <code>AlternateDataSourceParameters</code> list is null,
     *             the <code>Credentials</code> originally used with this <code>DataSourceParameters</code>
     *             are automatically allowed.</p>
     * 
     */
    public Output</* @Nullable */ List<DataSourceParameters>> getAlternateDataSourceParameters() {
        return this.alternateDataSourceParameters;
    }
    /**
     * <p>The Amazon Resource Name (ARN) of the data source.</p>
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return <p>The Amazon Resource Name (ARN) of the data source.</p>
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="awsAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsAccountId;

    public Output</* @Nullable */ String> getAwsAccountId() {
        return this.awsAccountId;
    }
    /**
     * <p>The time that this data source was created.</p>
     * 
     */
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return <p>The time that this data source was created.</p>
     * 
     */
    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    @OutputExport(name="credentials", type=DataSourceCredentials.class, parameters={})
    private Output</* @Nullable */ DataSourceCredentials> credentials;

    public Output</* @Nullable */ DataSourceCredentials> getCredentials() {
        return this.credentials;
    }
    @OutputExport(name="dataSourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSourceId;

    public Output</* @Nullable */ String> getDataSourceId() {
        return this.dataSourceId;
    }
    @OutputExport(name="dataSourceParameters", type=DataSourceParameters.class, parameters={})
    private Output</* @Nullable */ DataSourceParameters> dataSourceParameters;

    public Output</* @Nullable */ DataSourceParameters> getDataSourceParameters() {
        return this.dataSourceParameters;
    }
    @OutputExport(name="errorInfo", type=DataSourceErrorInfo.class, parameters={})
    private Output</* @Nullable */ DataSourceErrorInfo> errorInfo;

    public Output</* @Nullable */ DataSourceErrorInfo> getErrorInfo() {
        return this.errorInfo;
    }
    /**
     * <p>The last time that this data source was updated.</p>
     * 
     */
    @OutputExport(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return <p>The last time that this data source was updated.</p>
     * 
     */
    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * <p>A display name for the data source.</p>
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return <p>A display name for the data source.</p>
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * <p>A list of resource permissions on the data source.</p>
     * 
     */
    @OutputExport(name="permissions", type=List.class, parameters={DataSourceResourcePermission.class})
    private Output</* @Nullable */ List<DataSourceResourcePermission>> permissions;

    /**
     * @return <p>A list of resource permissions on the data source.</p>
     * 
     */
    public Output</* @Nullable */ List<DataSourceResourcePermission>> getPermissions() {
        return this.permissions;
    }
    @OutputExport(name="sslProperties", type=DataSourceSslProperties.class, parameters={})
    private Output</* @Nullable */ DataSourceSslProperties> sslProperties;

    public Output</* @Nullable */ DataSourceSslProperties> getSslProperties() {
        return this.sslProperties;
    }
    @OutputExport(name="status", type=DataSourceResourceStatus.class, parameters={})
    private Output<DataSourceResourceStatus> status;

    public Output<DataSourceResourceStatus> getStatus() {
        return this.status;
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.</p>
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DataSourceTag.class})
    private Output</* @Nullable */ List<DataSourceTag>> tags;

    /**
     * @return <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.</p>
     * 
     */
    public Output</* @Nullable */ List<DataSourceTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=DataSourceType.class, parameters={})
    private Output</* @Nullable */ DataSourceType> type;

    public Output</* @Nullable */ DataSourceType> getType() {
        return this.type;
    }
    @OutputExport(name="vpcConnectionProperties", type=DataSourceVpcConnectionProperties.class, parameters={})
    private Output</* @Nullable */ DataSourceVpcConnectionProperties> vpcConnectionProperties;

    public Output</* @Nullable */ DataSourceVpcConnectionProperties> getVpcConnectionProperties() {
        return this.vpcConnectionProperties;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSource(String name, @Nullable DataSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:DataSource", name, args == null ? DataSourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataSource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:DataSource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataSource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataSource(name, id, options);
    }
}
