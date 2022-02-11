package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new ilya.mihailenko.myapplication.DataBinderMapperImpl());
  }
}
