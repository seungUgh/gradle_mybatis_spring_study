package gradle_mybatis_spring_study.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import gradle_mybatis_spring_study.dto.PhoneNumber;

public class PhoneTypeHandler extends BaseTypeHandler<PhoneNumber> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, PhoneNumber parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(1, parameter.toString());
	}

	@Override
	public PhoneNumber getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new PhoneNumber(rs.getString(columnName));
		//생성자로 넣어주니깐 3개의 필드로 들어감....
	}

	@Override
	public PhoneNumber getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		//매개변수가 index니깐 .. 
		return new PhoneNumber(rs.getString(columnIndex));
	}

	@Override
	public PhoneNumber getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new PhoneNumber(cs.getString(columnIndex));
	}

}
