// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.quicksight.DataSetArgs;
import io.pulumi.awsnative.quicksight.enums.DataSetImportMode;
import io.pulumi.awsnative.quicksight.outputs.DataSetColumnGroup;
import io.pulumi.awsnative.quicksight.outputs.DataSetColumnLevelPermissionRule;
import io.pulumi.awsnative.quicksight.outputs.DataSetFieldFolderMap;
import io.pulumi.awsnative.quicksight.outputs.DataSetIngestionWaitPolicy;
import io.pulumi.awsnative.quicksight.outputs.DataSetLogicalTableMap;
import io.pulumi.awsnative.quicksight.outputs.DataSetOutputColumn;
import io.pulumi.awsnative.quicksight.outputs.DataSetPhysicalTableMap;
import io.pulumi.awsnative.quicksight.outputs.DataSetResourcePermission;
import io.pulumi.awsnative.quicksight.outputs.DataSetRowLevelPermissionDataSet;
import io.pulumi.awsnative.quicksight.outputs.DataSetTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of the AWS::QuickSight::DataSet Resource Type.
 * 
 */
@ResourceType(type="aws-native:quicksight:DataSet")
public class DataSet extends io.pulumi.resources.CustomResource {
    /**
     * <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return <p>The Amazon Resource Name (ARN) of the resource.</p>
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="awsAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsAccountId;

    public Output</* @Nullable */ String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * <p>Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.</p>
     * 
     */
    @Export(name="columnGroups", type=List.class, parameters={DataSetColumnGroup.class})
    private Output</* @Nullable */ List<DataSetColumnGroup>> columnGroups;

    /**
     * @return <p>Groupings of columns that work together in certain QuickSight features. Currently, only geospatial hierarchy is supported.</p>
     * 
     */
    public Output</* @Nullable */ List<DataSetColumnGroup>> columnGroups() {
        return this.columnGroups;
    }
    @Export(name="columnLevelPermissionRules", type=List.class, parameters={DataSetColumnLevelPermissionRule.class})
    private Output</* @Nullable */ List<DataSetColumnLevelPermissionRule>> columnLevelPermissionRules;

    public Output</* @Nullable */ List<DataSetColumnLevelPermissionRule>> columnLevelPermissionRules() {
        return this.columnLevelPermissionRules;
    }
    /**
     * <p>The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't
     *             imported into SPICE.</p>
     * 
     */
    @Export(name="consumedSpiceCapacityInBytes", type=Double.class, parameters={})
    private Output<Double> consumedSpiceCapacityInBytes;

    /**
     * @return <p>The amount of SPICE capacity used by this dataset. This is 0 if the dataset isn't
     *             imported into SPICE.</p>
     * 
     */
    public Output<Double> consumedSpiceCapacityInBytes() {
        return this.consumedSpiceCapacityInBytes;
    }
    /**
     * <p>The time that this dataset was created.</p>
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return <p>The time that this dataset was created.</p>
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    @Export(name="dataSetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSetId;

    public Output</* @Nullable */ String> dataSetId() {
        return this.dataSetId;
    }
    @Export(name="fieldFolders", type=DataSetFieldFolderMap.class, parameters={})
    private Output</* @Nullable */ DataSetFieldFolderMap> fieldFolders;

    public Output</* @Nullable */ DataSetFieldFolderMap> fieldFolders() {
        return this.fieldFolders;
    }
    @Export(name="importMode", type=DataSetImportMode.class, parameters={})
    private Output</* @Nullable */ DataSetImportMode> importMode;

    public Output</* @Nullable */ DataSetImportMode> importMode() {
        return this.importMode;
    }
    @Export(name="ingestionWaitPolicy", type=DataSetIngestionWaitPolicy.class, parameters={})
    private Output</* @Nullable */ DataSetIngestionWaitPolicy> ingestionWaitPolicy;

    public Output</* @Nullable */ DataSetIngestionWaitPolicy> ingestionWaitPolicy() {
        return this.ingestionWaitPolicy;
    }
    /**
     * <p>The last time that this dataset was updated.</p>
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return <p>The last time that this dataset was updated.</p>
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    @Export(name="logicalTableMap", type=DataSetLogicalTableMap.class, parameters={})
    private Output</* @Nullable */ DataSetLogicalTableMap> logicalTableMap;

    public Output</* @Nullable */ DataSetLogicalTableMap> logicalTableMap() {
        return this.logicalTableMap;
    }
    /**
     * <p>The display name for the dataset.</p>
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return <p>The display name for the dataset.</p>
     * 
     */
    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    /**
     * <p>The list of columns after all transforms. These columns are available in templates,
     *             analyses, and dashboards.</p>
     * 
     */
    @Export(name="outputColumns", type=List.class, parameters={DataSetOutputColumn.class})
    private Output<List<DataSetOutputColumn>> outputColumns;

    /**
     * @return <p>The list of columns after all transforms. These columns are available in templates,
     *             analyses, and dashboards.</p>
     * 
     */
    public Output<List<DataSetOutputColumn>> outputColumns() {
        return this.outputColumns;
    }
    /**
     * <p>A list of resource permissions on the dataset.</p>
     * 
     */
    @Export(name="permissions", type=List.class, parameters={DataSetResourcePermission.class})
    private Output</* @Nullable */ List<DataSetResourcePermission>> permissions;

    /**
     * @return <p>A list of resource permissions on the dataset.</p>
     * 
     */
    public Output</* @Nullable */ List<DataSetResourcePermission>> permissions() {
        return this.permissions;
    }
    @Export(name="physicalTableMap", type=DataSetPhysicalTableMap.class, parameters={})
    private Output</* @Nullable */ DataSetPhysicalTableMap> physicalTableMap;

    public Output</* @Nullable */ DataSetPhysicalTableMap> physicalTableMap() {
        return this.physicalTableMap;
    }
    @Export(name="rowLevelPermissionDataSet", type=DataSetRowLevelPermissionDataSet.class, parameters={})
    private Output</* @Nullable */ DataSetRowLevelPermissionDataSet> rowLevelPermissionDataSet;

    public Output</* @Nullable */ DataSetRowLevelPermissionDataSet> rowLevelPermissionDataSet() {
        return this.rowLevelPermissionDataSet;
    }
    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.</p>
     * 
     */
    @Export(name="tags", type=List.class, parameters={DataSetTag.class})
    private Output</* @Nullable */ List<DataSetTag>> tags;

    /**
     * @return <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the dataset.</p>
     * 
     */
    public Output</* @Nullable */ List<DataSetTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataSet(String name) {
        this(name, DataSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataSet(String name, @Nullable DataSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSet(String name, @Nullable DataSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:DataSet", name, args == null ? DataSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataSet(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:quicksight:DataSet", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static DataSet get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataSet(name, id, options);
    }
}
